package com.example.firebaserealtimedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class InsertionActivity : AppCompatActivity() {
    private lateinit var edtEmpName: EditText
    private lateinit var edtEmpAge: EditText
    private lateinit var edtEmpSalary: EditText
    private lateinit var btnSave: Button

    private lateinit var dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertion)
        edtEmpAge = findViewById(R.id.edtEmpAge)
        edtEmpName = findViewById(R.id.edtEmpName)
        edtEmpSalary = findViewById(R.id.edtEmpSalary)
        btnSave = findViewById(R.id.btnSave)

        dbRef = FirebaseDatabase.getInstance().getReference("Employees")

        btnSave.setOnClickListener {
            saveEployeeData()
        }
    }

    private fun saveEployeeData() {
        val empName = edtEmpName.text.toString()
        val empAge = edtEmpAge.text.toString()
        val empSalary = edtEmpSalary.text.toString()
        val empId = dbRef.push().key!!
        val employee = EmployeeModel(empId,empName,empAge,empSalary)
        if (empName.isEmpty()) {
            edtEmpName.error = "Please enter name"
            return
        }
        if (empAge.isEmpty()) {
            edtEmpAge.error = "Please enter age"
            return
        }
        if (empSalary.isEmpty()) {
            edtEmpSalary.error = "Please enter Salary"
            return
        }
        dbRef.child(empId).setValue(employee).addOnCompleteListener {
            Toast.makeText(this@InsertionActivity, "Data insert thành công", Toast.LENGTH_SHORT).show()
            edtEmpName.setText("")
            edtEmpAge.setText("")
            edtEmpSalary.setText("")
        }
            .addOnFailureListener { err ->
                Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_SHORT).show()
            }
    }
}
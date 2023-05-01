package com.example.ontap

import android.content.DialogInterface
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.edit
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var cbRemember: CheckBox
    private lateinit var btnLogin: Button
    private lateinit var tvOutput: TextView
    private lateinit var imgDelete: ImageView
    private lateinit var view_group_relative: RelativeLayout
    private lateinit var sharedPreferencesUtils: SharedPreferencesUtils


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        eventView()
        displayOutput()

    }

    private fun displayOutput() {
        sharedPreferencesUtils
            val email = sharedPreferencesUtils.getStringValue("email")
            val password = sharedPreferencesUtils.getStringValue("password")
            val isRemember = sharedPreferencesUtils.getBooleanValue("checked")
            if (isRemember){
                view_group_relative.isVisible = true
                val spanned = SpannableStringBuilder().apply {
                    append("Email: $email")
                    append("\n")
                    append("Password: $password")
                }
                cbRemember.isChecked = true
                tvOutput.text = spanned
                edtEmail.setText(email)
                edtPassword.setText(password)
            }else{
                view_group_relative.isVisible = false
                sharedPreferencesUtils.clear()
            }
        }

    private fun eventView() {
        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()
            var message = ""
            if (email.isEmpty()){
                message = "Bạn chưa nhập email"
            }else if (password.isEmpty()){
                message = "Bạn chưa nhập password"
            }else if (email == "abc@gmail.com" && password == "12345678"){
                saveAccount(email,password,cbRemember.isChecked)
                message = "Đăng nhập tài khoản"
            }else{
                message = "Đăng nhập sai tài khoản"
            }
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        }
        imgDelete.setOnClickListener {
            dialogDelete()
        }
    }

    private fun dialogDelete() {
            val alertDialogBuilder = AlertDialog.Builder(this@MainActivity)
            alertDialogBuilder.setTitle("Thông báo")
            alertDialogBuilder.setMessage("Bạn có muốn xóa dữ liện?")
            alertDialogBuilder.setPositiveButton("Có") { dialog, position ->
                sharedPreferencesUtils
                    .removeKey("email")
                    .removeKey("password")
                    .removeKey("checked")
                    .apply()
            }
            alertDialogBuilder.setNegativeButton("Không") { dialog, position ->
            }
            alertDialogBuilder.show()
    }

    private fun saveAccount(email: String, password: String,isRemember:Boolean) {
        if (isRemember){
            sharedPreferencesUtils
                .setStringValue("email",email)
                .setStringValue("password",password)
                .setBooleanValue("checked",true)
                .apply()
        }else{
            sharedPreferencesUtils.clear()
        }
    }

    private fun initView() {
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        cbRemember = findViewById(R.id.cbRemember)
        btnLogin = findViewById(R.id.btnLogin)
        tvOutput = findViewById(R.id.tvOutput)
        imgDelete = findViewById(R.id.imgDelete)
        view_group_relative = findViewById(R.id.view_group_relative)
        sharedPreferencesUtils = SharedPreferencesUtils(this)
    }
}
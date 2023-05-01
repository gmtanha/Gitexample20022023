package com.example.sharepreferenceandalertdialog20022023

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
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var checkBoxRemember: CheckBox
    private lateinit var btnLogin: Button
    private lateinit var tvOutput: TextView
    private lateinit var imgDelete: ImageView
    private lateinit var viewGroupOutput: RelativeLayout
    private lateinit var sharePreferenceUtils: SharePreferenceUtils


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        eventView()
        displayOutput()
    }
    private fun initView() {
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        checkBoxRemember = findViewById(R.id.cbRemember)
        btnLogin = findViewById(R.id.btnLogin)
        tvOutput = findViewById(R.id.tvOutput)
        imgDelete = findViewById(R.id.imgDelete)
        viewGroupOutput = findViewById(R.id.relative_ground_output)
        sharePreferenceUtils = SharePreferenceUtils(this)
    }
    private fun displayOutput() {
        sharePreferenceUtils
            val email = sharePreferenceUtils.getStringValue("email")
            val password = sharePreferenceUtils.getStringValue("password")
            val isRemember = sharePreferenceUtils.getBooleanValue("checked")
            if (isRemember){
                viewGroupOutput.isVisible= true
                val spanned = SpannableStringBuilder().apply {
                    append("Email: $email")
                    append("\n")
                    append("Password: $password")
                }
                checkBoxRemember.isChecked = true
                tvOutput.text = spanned
                edtEmail.setText(email)
                edtPassword.setText(password)
            }else{
                viewGroupOutput.isVisible = false
                sharePreferenceUtils.clear()
            }
        }

    private fun eventView(
    ) {
        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()
            var mesage = if (email.isEmpty()){
                "Bạn chưa nhập email"
            }else if (password.isEmpty()){
                "Bạn chưa nhập password"
            }else if (email == "abc@gmail.com" && password == "12345678"){
                saveAccount(email, password, checkBoxRemember.isChecked)
                "Đăng nhập thành công"
            }else{
                "Đăng nhập sai tài khoản"
            }
            Toast.makeText(this@MainActivity,mesage,Toast.LENGTH_SHORT).show()
        }
        imgDelete.setOnClickListener {
            showDialogDelete()
        }
    }

    private fun showDialogDelete(){
        val alertDialogBuiler = AlertDialog.Builder(this)
        alertDialogBuiler.setTitle("Thông báo")
        alertDialogBuiler.setMessage("Bạn có muốn xóa dữ liệu ?")
        alertDialogBuiler.setPositiveButton("Có") { dialog, position ->
            sharePreferenceUtils
                .removeKey("email")
                .removeKey("password")
                .removeKey("checked")
                .apply()
            }
        alertDialogBuiler.setNegativeButton("Không") { dialog, position ->
        }
        alertDialogBuiler.show()
    }
    private fun saveAccount(
        email:String,
        password:String,
        isRemember: Boolean
    ) {
        if (isRemember){
            sharePreferenceUtils
                .setStringValue("email", email)
                .setStringValue("password", password)
                .setBooleanValue("checked", true)
                .apply()
        }else{
            sharePreferenceUtils.clear()
        }
    }

}
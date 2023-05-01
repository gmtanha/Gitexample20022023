package com.example.baitapsharedpreferences

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
    private lateinit var viewGroup: RelativeLayout
    private lateinit var sharedPreferencesUtils: SharedPreferencesUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AnhXa()
        eventView()
        showPassword()
    }

    private fun showPassword() {
        sharedPreferencesUtils
            val email = sharedPreferencesUtils.getStringValue("email")
            val password = sharedPreferencesUtils.getStringValue("password")
            val isRemember = sharedPreferencesUtils.getStringBoolean("checked")
            if (isRemember){
                viewGroup.isVisible = true
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
                viewGroup.isVisible = false
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
            }else if (email.equals("abc@gmail.com") && password.equals("12345678")){
                saveAccount(email,password,cbRemember.isChecked)
                message = "Đăng nhập thành công"
            }else{
                message = "Lỗi đăng nhập"
            }
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        }
        imgDelete.setOnClickListener {
            showDelete()
        }
    }

    private fun showDelete() {
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Thông Báo")
        alertDialog.setMessage("Bạn có muốn dữ liệu ?")
        alertDialog.setPositiveButton("Yes"){dialog, position ->
            sharedPreferencesUtils
                .removekey("email")
                .removekey("password")
                .removekey("checked")
                .apply()
        }
        alertDialog.setNegativeButton("No"){dialog, position -> }
        alertDialog.show()
    }

    private fun saveAccount(email: String, password: String, isRemember: Boolean) {
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

    private fun AnhXa() {
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        cbRemember = findViewById(R.id.cbRemember)
        btnLogin = findViewById(R.id.btnLogin)
        tvOutput = findViewById(R.id.tvOutput)
        imgDelete = findViewById(R.id.imgDelete)
        viewGroup = findViewById(R.id.viewGroup)
        sharedPreferencesUtils = SharedPreferencesUtils(this)
    }
}
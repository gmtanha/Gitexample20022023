package com.example.baitapmvvmdangnhap

class AuthenticationRepository(var sharePreferenceApp: SharePreferenceApp) {
    fun login(email:String,password:String,isSave:Boolean):Boolean{
        if (email == "abc@gmail.com" && password == "12345678"){
            saveAccount(email,password,isSave)
            return true
        }
        return false
    }
    fun getUser():Triple<String,String,Boolean>?{
        if (sharePreferenceApp.getBooleanValue("isSave")){
            val email = sharePreferenceApp.getStringValue("email")?: ""
            val password = sharePreferenceApp.getStringValue("password")?: ""
            return Triple(email,password,true)
        }
        return null
    }

    private fun saveAccount(email: String, password: String, isSave: Boolean) {
        if (isSave){
            sharePreferenceApp
                .setStringValue("email",email)
                .setStringValue("password",password)
                .setBooleanValue("isSave",true)
                .apply()
        }else{
            sharePreferenceApp.clear()
        }
    }
}
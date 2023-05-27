package com.example.baitapmvvmdangnhap

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(var authenticationRepository: AuthenticationRepository): ViewModel() {
    private var mutableLiveDataUser:MutableLiveData<Triple<String,String,Boolean>> = MutableLiveData()
    private var mutableLiveDataMessage:MutableLiveData<String> = MutableLiveData()
    fun getLiveDataMessage():LiveData<String> = mutableLiveDataMessage
    fun getLiveDataUser():LiveData<Triple<String,String,Boolean>> = mutableLiveDataUser

    fun login(email:String,password:String,isSave:Boolean){
        val message = when (authenticationRepository.login(email,password,isSave)){
            true -> "Đăng nhập thành công"
            else -> "Đăng nhập thất bại"
        }
        mutableLiveDataMessage.value = message
    }
    fun getDataUser(){
        authenticationRepository.getUser()?.let {
            mutableLiveDataUser.value = it
        }
    }
}
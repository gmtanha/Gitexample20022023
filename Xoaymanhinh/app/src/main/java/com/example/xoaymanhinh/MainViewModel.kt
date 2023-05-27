package com.example.xoaymanhinh

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel: ViewModel() {
    private var mutableLiveDataNumber: MutableLiveData<Int> = MutableLiveData()

    fun getNumberLiveData() = mutableLiveDataNumber

    fun randomNumber() {
        mutableLiveDataNumber.value = Random.nextInt(100)
    }
}
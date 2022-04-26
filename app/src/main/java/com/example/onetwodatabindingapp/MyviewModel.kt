package com.example.onetwodatabindingapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyviewModel:ViewModel() {
    val username = MutableLiveData<String>()

    init {
        username.value="Praveen"
    }
}
package com.romanuriel.chatconnect.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {
    val message = MutableLiveData<String>()
    fun onStartMessage(){
        message.postValue("Mi mensaje")
    }
}
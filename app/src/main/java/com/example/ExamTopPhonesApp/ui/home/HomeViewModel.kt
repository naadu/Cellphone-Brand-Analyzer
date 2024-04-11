package com.example.ExamTopPhonesApp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Welcome to the Top Phones App.\n" +
                "Please use the navigation drawer on\n" +
                "You're left to select the phone brand\n" +
                "You would like to view"

    }
    val text: LiveData<String> = _text
}
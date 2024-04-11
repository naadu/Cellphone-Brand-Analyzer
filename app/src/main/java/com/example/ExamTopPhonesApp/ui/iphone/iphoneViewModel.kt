package com.example.ExamTopPhonesApp.ui.iphone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class iphoneViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Phone brand description:\n" +
        "The IPhone is a line of touchscreen-based\n" +
                "Smart phones designed and marketed by Apple\n" +
        "Inc. that you Apples, iOS mobile operating\n" +
                "system. The first-generation iPhone was\n" +
                "announced by Apple co-founder Steve Jobs on\n" +
                "January 9, 2007. Since then Apple has annually\n" +
                "released new iPhone models and iOS updates.."
    }
    val text: LiveData<String> = _text
}
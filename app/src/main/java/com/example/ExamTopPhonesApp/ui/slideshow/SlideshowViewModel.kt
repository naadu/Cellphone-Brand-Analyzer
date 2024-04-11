package com.example.ExamTopPhonesApp.ui.samsung

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Phone brand description:\n" +
                "Samsung is a South Korean multinational\n" +
                "conglomerate headquartered in Samsung\n" +
                "Town, Seoul. It comprises numerous affiliated\n" +
                "businesses, most of them united under the\n" +
                "Samsung brand, and is the largest South\n" +
                "Korean chaebol. Samsung was founded by Lee\n" +
                "Byung-chul in 1938 as a trading company."
    }
    val text: LiveData<String> = _text
}
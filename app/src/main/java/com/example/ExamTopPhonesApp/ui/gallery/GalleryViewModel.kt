package com.example.ExamTopPhonesApp.ui.huawei

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Phone brand description:\n" +
                "Huawei Is the second-biggest smartphone\n" +
                "maker in the world, after Samsung, as of the\n" +
                "first quarter of 2019. Their portfolio of phones\n" +
                "includes both high-end smartphones, its Huawei\n" +
                "Mate series and Huawei P series, and cheaper\n" +
                "handsets that fall under its honor brand."
    }
    val text: LiveData<String> = _text
}
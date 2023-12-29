package com.example.splitcalc

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    companion object {
        var peopleList = MutableLiveData<ArrayList<String>>()

        fun addPeople(str: String) {
            peopleList.value?.add(str)
        }
    }
}
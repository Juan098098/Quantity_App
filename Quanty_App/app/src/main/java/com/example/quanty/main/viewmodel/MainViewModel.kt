package com.example.quanty.main.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.quanty.R

class MainViewModel: ViewModel() {
    //private var currentUser: User? = null

    /*
    * This method will be called when this ViewModel is no longer used and will be destroyed.
    *It is useful when ViewModel observes some data and you need to clear this subscription to prevent a leak of this ViewModel.
    */
    init {
        Log.i("MainViewModel", "MainViewModel Created!")
    }


}
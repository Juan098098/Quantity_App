package com.example.quantity.home.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    /*
* This method will be called when this ViewModel is no longer used and will be destroyed.
*It is useful when ViewModel observes some data and you need to clear this subscription to prevent a leak of this ViewModel.
*/

    init {
        Log.i("GameViewModel", "GameViewModel Created!")
    }

}
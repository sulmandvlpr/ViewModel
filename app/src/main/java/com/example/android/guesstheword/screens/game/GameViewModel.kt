
package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

// TODO (02) Create the GameViewModel class, extending ViewModel
// TODO (03) Add init and override onCleared; Add log statements to both
class GameViewModel: ViewModel(){

    init {
Log.i("GameViewModel","GameViewModel Created")
    }

    override fun onCleared() {
super.onCleared()
    Log.i("GameVIewModel","ViewModel destroyed")
    }
}
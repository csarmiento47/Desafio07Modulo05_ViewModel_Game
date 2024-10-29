package com.desafiolatam.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val upperCounterMutableStateFlow: MutableStateFlow<Int> = MutableStateFlow(10)
    private val lowerCounterMutableStateFlow: MutableStateFlow<Int> = MutableStateFlow(10)

    val upperCounterStateFlow: StateFlow<Int> = upperCounterMutableStateFlow.asStateFlow()
    val lowerCounterStateFlow: StateFlow<Int> = lowerCounterMutableStateFlow.asStateFlow()


    fun increaseUpper() {

    }

    fun increaseLower() {

    }

    fun resetScores() {

    }

    fun isGameFinished(): Boolean {
        return false
    }


}
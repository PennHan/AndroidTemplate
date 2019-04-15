package com.example.app_main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainModelFactory() : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel() as T
    }
}
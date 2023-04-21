package com.lyescorp.fragmentsandmaps.viewmodels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModel: ViewModel() {

    init{

    }

    @Suppress("UNCHECKED_CAST")
    class MainViewModelFactory(): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MainViewModel() as T
        }
    }


}
package com.example.daggerhiltimp

import androidx.lifecycle.ViewModel
import com.example.daggerhiltimp.domin.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

// this == viewModelProvider
@HiltViewModel
// inject dependencies using dagger hilt and inject it in the constructor and take look in your modules and see if you can find these
class MyViewModel @Inject constructor(
    private val repo : MyRepository
) : ViewModel() {
}
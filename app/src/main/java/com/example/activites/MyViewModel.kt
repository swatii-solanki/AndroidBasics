package com.example.activites

import androidx.lifecycle.ViewModel
import com.example.activites.repo.MyRepo
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val myRepo: Lazy<MyRepo>
) : ViewModel() {


}
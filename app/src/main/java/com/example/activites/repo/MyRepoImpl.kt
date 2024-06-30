package com.example.activites.repo

import com.example.activites.remote.MyApi
import javax.inject.Inject

class MyRepoImpl @Inject constructor(
    private val myApi: MyApi
) : MyRepo {

    override suspend fun doNetworkCall() {
        myApi.doNetworkCall()
    }
}
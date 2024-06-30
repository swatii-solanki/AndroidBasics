package com.example.activites.remote

import retrofit2.http.POST

interface MyApi {

    @POST
    suspend fun doNetworkCall()
}
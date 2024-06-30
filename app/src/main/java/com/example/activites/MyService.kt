package com.example.activites

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.activites.repo.MyRepo
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService : Service() {

    @Inject
    lateinit var myRepo: MyRepo

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}
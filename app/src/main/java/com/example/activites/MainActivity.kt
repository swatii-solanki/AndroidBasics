package com.example.activites

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.first_button).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, FirstFragment())
                addToBackStack(null)
                commit()
            }
        }

        findViewById<Button>(R.id.second_button).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, SecondFragment())
                addToBackStack(null)
                commit()
            }
        }


        Log.d("TAG", "First Activity")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
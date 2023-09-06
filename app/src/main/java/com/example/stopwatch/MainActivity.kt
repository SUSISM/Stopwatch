package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //public static final double PI = 3.14 declaring a classwide constant in Java
    // in kotlin we use a companion object
    companion object{
        //TAG is the default var name for labling your log statements
        val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: a log")
    }
    //to override an existing function, just start typing it
    //can do this for the rest of the lifecycle functions (or any
    //function that exist in the superclass
    override fun onStart(){
        super.onStart()
    }
}
package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.w("MyDetailActivity","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.w("MyDetailActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("MyDetailActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("MyDetailActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("MyDetailActivity","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("MyDetailActivity","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("MyDetailActivity", "onDestroy")
    }
}
package com.example.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("MyMainActivity","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.w("MyMainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("MyMainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("MyMainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("MyMainActivity","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("MyMainActivity","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("MyMainActivity", "onDestroy")
    }

    fun onClickToDetailActivity(view : View) {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }

    fun openWebPage(url : String) {
        val web_addres: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, web_addres)
        startActivity(intent)
    }

    fun onClickToWeb(view : View) {
        val url = "https://www.google.com/"
        openWebPage(url)
    }

}
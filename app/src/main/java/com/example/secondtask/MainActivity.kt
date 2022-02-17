package com.example.secondtask

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val NUMBER = "number"
    }

    private var count = 0
        set(value) {
            field = value
            textCount.text = value.toString()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MyTag", "MainActivity.onCreate")

        btnStartSecondActivity.setOnClickListener {
            startSecondActivity()
        }
    }

    private fun startSecondActivity() {
        val intent = Intent(
            this,
            SecondActivity::class.java
        ).apply {
            putExtra(SecondActivity.SQUARE, count * count)
        }

        startActivity(intent)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("MyTag", "MainActivity.onSaveInstanceState")
        outState.putInt(NUMBER, count)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("MyTag", "MainActivity.onRestoreInstanceState")
        count = savedInstanceState.getInt(NUMBER, 0)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.i("MyTag", "MainActivity.onConfigurationChanged")
        count++
    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTag", "MainActivity.onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag", "MainActivity.onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag", "MainActivity.onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag", "MainActivity.onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTag", "MainActivity.onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag", "MainActivity.onDestroy")
    }
}

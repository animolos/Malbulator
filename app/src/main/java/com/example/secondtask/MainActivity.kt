package com.example.secondtask

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.secondtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        const val NUMBER = "number"
    }

    private var number = 0
        set(value) {
            field = value
            binding.textNumber.text = value.toString()
        }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MyTag", "MainActivity.onCreate")

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSquareNumber.setOnClickListener {
            startSecondActivity()
        }
    }

    private fun startSecondActivity() {
        val intent = Intent(
            this,
            SecondActivity::class.java
        ).apply {
            putExtra(SecondActivity.SQUARE, number * number)
        }

        startActivity(intent)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("MyTag", "MainActivity.onSaveInstanceState")
        outState.putInt(NUMBER, number)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("MyTag", "MainActivity.onRestoreInstanceState")
        number = savedInstanceState.getInt(NUMBER, 0)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.i("MyTag", "MainActivity.onConfigurationChanged")
        number++
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

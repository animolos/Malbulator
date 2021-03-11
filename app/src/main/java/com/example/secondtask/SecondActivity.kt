package com.example.secondtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val SQUARE = "square"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MyTag", "SecondActivity.onCreate")

        val count = intent.getIntExtra(SQUARE, 0)
        textSquare.text = count.toString()

        btnFinishActivity.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTag", "SecondActivity.onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag", "SecondActivity.onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag", "SecondActivity.onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag", "SecondActivity.onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTag", "SecondActivity.onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag", "SecondActivity.onDestroy")
    }
}
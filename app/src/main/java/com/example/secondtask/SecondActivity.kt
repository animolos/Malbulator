package com.example.secondtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.secondtask.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    companion object {
        const val SQUARE = "square"
    }

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MyTag", "SecondActivity.onCreate")

        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val count = intent.getIntExtra(SQUARE, 0)
        binding.textSquare.text = count.toString()

        binding.btnGoBack.setOnClickListener {
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
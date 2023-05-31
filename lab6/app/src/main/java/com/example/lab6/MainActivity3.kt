package com.example.lab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lab6.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button3.setOnClickListener{
            val intentPersonData=intent.getParcelableExtra<Person>("personData")
            val intentQuantity = intent.getIntExtra("quantity", -1)
            intentPersonData.let {
                if(intentQuantity != -1){
                    binding.textView2.text = "$it $intentQuantity"
                }
            }
        }
        binding.button3.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lab6", "DestroyCalled")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("lab6", "saveCalled")
        outState.apply {
            putString("programmerData", binding.textView2.text.toString())
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("lab6", "restoreCalled")
        savedInstanceState.run {
            binding.textView2.text = getString("programmerData")
        }
    }
}
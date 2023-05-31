package com.example.lab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab6.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener{
        val data=binding.editTextTextPersonName.toString().split(" ")
        val PersonData=Person(data[0], data[1].toInt(), data[2])
            startActivity(Intent(this,MainActivity3::class.java).apply{
                putExtra("personData", PersonData)
                putExtra("quantity", 1)
            })
}
    }
}
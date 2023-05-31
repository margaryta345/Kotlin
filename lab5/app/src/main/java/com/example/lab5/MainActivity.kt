package com.example.lab5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import com.example.lab5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                binding.button.setBackgroundColor(Color.BLUE)
            }

        })
        binding.button2.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                binding.textView.text = binding.editText.text
            }
        })

        binding.switch1.setOnCheckedChangeListener{it, isChecked ->
            val message = if(isChecked) "On" else "Off"
            binding.textView2.text = message
        }


        binding.editText.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //TODO("Not yet implemented")
                binding.textView3.text = "Text is not changed"
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //TODO("Not yet implemented")
                binding.textView3.text = "Text is changing"
            }

            override fun afterTextChanged(p0: Editable?) {
                //TODO("Not yet implemented")
                binding.textView3.text = "Text is changed"
            }

        })
        binding.seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //TODO("Not yet implemented")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                //TODO("Not yet implemented")

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                //TODO("Not yet implemented")
                val message = "I am happy with your work " + binding.seekBar.progress + "%"
                Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
            }

        })
    }
}
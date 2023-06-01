package com.example.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.navigation.fragment.NavHostFragment
import com.example.lab7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment=binding.fragmentContainerView.getFragment<NavHostFragment>()
        val firrstFragment=navHostFragment.childFragmentManager.fragments[0] as FirrstFragment
        firrstFragment.childFragmentManager.setFragmentResult(
            "main_data",
            bundleOf("text" to "data_fron_main_activity")
        )
    }
}
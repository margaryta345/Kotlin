package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab7.databinding.FragmentFirrstBinding


class FirrstFragment : Fragment() {
private lateinit var binding: FragmentFirrstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentFirrstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var result:String? = ""
        childFragmentManager.setFragmentResultListener("main_data", this){_, bundle->
            result = bundle.getString("text")
            binding.textView2.text = result

        }
        binding.button4.setOnClickListener {
            result?.let{
                findNavController().navigate(FirrstFragmentDirections.actionFirrstFragmentToSecondFragment2())
            }
        }
    }
}
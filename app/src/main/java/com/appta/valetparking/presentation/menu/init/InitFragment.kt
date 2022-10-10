package com.appta.valetparking.presentation.menu.init

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.appta.valetparking.databinding.FragmentInitBinding

class InitFragment : Fragment() {


    private lateinit var binding: FragmentInitBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInitBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegister.setOnClickListener{
            val action = InitFragmentDirections.actionInitFragmentToRegisterVehicleFragment()
            findNavController().navigate(action)
        }
        binding.btnShow.setOnClickListener{
            val action = InitFragmentDirections.actionInitFragmentToVehicleFragment2()
            findNavController().navigate(action)
        }
    }
}
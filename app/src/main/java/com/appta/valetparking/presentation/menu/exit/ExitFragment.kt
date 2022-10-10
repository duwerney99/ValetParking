package com.appta.valetparking.presentation.menu.exit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appta.valetparking.R
import com.appta.valetparking.databinding.FragmentExitBinding
import com.appta.valetparking.databinding.FragmentInitBinding

class ExitFragment : Fragment() {

    private lateinit var binding: FragmentExitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExitBinding.inflate(inflater, container, false)
        return binding.root
    }


}
package com.appta.valetparking.presentation.authentication.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.appta.valetparking.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Handler(Looper.getMainLooper()).postDelayed({
            val action = SplashFragmentDirections.actionSplashFragmentToInitFragment()
            findNavController().navigate(action)
        }, 3000)
    }

}
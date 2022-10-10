package com.appta.valetparking.presentation.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appta.valetparking.databinding.ActivityAuthenticationBinding
import com.appta.valetparking.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AuthenticationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthenticationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthenticationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
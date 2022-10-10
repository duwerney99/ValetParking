package com.appta.valetparking.presentation.menu.register

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.appta.valetparking.databinding.FragmentRegisterVehicleBinding
import com.example.movies.data.datasource.local.room.dao.VehicleEntity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class RegisterVehicleFragment : Fragment() {

    private lateinit var binding: FragmentRegisterVehicleBinding
    private val registerVehicleViewModel: RegisterVehicleViewModel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterVehicleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        insertVehicle()
    }
    

    private fun insertVehicle() {
        binding.btnRegister.setOnClickListener {
            val reply = Intent()
            if (binding.itPlate.text.toString()
                    .isNotEmpty() && !TextUtils.isEmpty(binding.itVehicle.text) &&
                !TextUtils.isEmpty(binding.itDriver.text)
            ) { registerVehicleViewModel.insertVehicle(
                    VehicleEntity(binding.itPlate.text.toString(), binding.itVehicle.text.toString(), binding.itDriver.text.toString(),
                        "09/10/2022",
                        "09/10/2022"))
                activity?.onBackPressed()
            }
            println("process finish")
            println()
        }
    }
}
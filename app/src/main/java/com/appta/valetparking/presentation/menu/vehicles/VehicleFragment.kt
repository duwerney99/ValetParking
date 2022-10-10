package com.appta.valetparking.presentation.menu.vehicles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.appta.valetparking.R
import com.appta.valetparking.databinding.FragmentVehicleBinding
import com.appta.valetparking.domain.model.VehicleModel
import com.appta.valetparking.presentation.menu.vehicles.adapter.VehiclesAdapter

class VehicleFragment : Fragment() {

    private lateinit var binding: FragmentVehicleBinding
    private val vehiclesMode : VehicleViewModel by viewModels()
    private lateinit var vehicles: List<VehicleModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vehiclesMode.vehicleList.observe(this, Observer(::setVehiclesList))

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVehicleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vehiclesMode.getVehicles()
    }

    private fun recyclerVehicles() {
        binding.rvVehicles.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false )
        val adapter = VehiclesAdapter(vehicles)
        binding.rvVehicles.adapter = adapter
    }


    private fun setVehiclesList(list: List<VehicleModel>?) {
        this.vehicles = list!!  //podria ser nulo
        recyclerVehicles()

    }
}
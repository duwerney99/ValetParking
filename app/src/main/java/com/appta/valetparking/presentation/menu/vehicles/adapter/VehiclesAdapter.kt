package com.appta.valetparking.presentation.menu.vehicles.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.appta.valetparking.R
import com.appta.valetparking.domain.model.VehicleModel
import com.example.movies.data.datasource.local.room.dao.VehicleEntity

class VehiclesAdapter (private val vehiclesModel: List<VehicleModel>): RecyclerView.Adapter<VehiclesAdapter.VehicleHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleHolder { //Devuelve el objeto  holder que se le paso
        val layoutInflater =  LayoutInflater.from(parent.context)
        return VehicleHolder(layoutInflater.inflate(R.layout.vehicle_items, parent, false))
    }

    override fun onBindViewHolder(holder: VehicleHolder, position: Int) {
        holder.renderProfile(vehiclesModel[position]) //Coge la posicion en la lista y la pasa al holder
    }

    override fun getItemCount(): Int = vehiclesModel.size //Nos permite saber cuanto items hay


    class VehicleHolder(private val view: View): RecyclerView.ViewHolder(view) {


        private val tvPlate: TextView = view.findViewById(R.id.tvPlate)
        private val tvVehicle: TextView = view.findViewById(R.id.tvVehicle)
        private val tvDriver: TextView = view.findViewById(R.id.tvDriver)


        fun renderProfile(vehicle: VehicleModel){
            tvPlate.text = vehicle.plate
            tvVehicle.text = vehicle.typeVehicle
            tvDriver.text = vehicle.nameDriver
        }
    }
}
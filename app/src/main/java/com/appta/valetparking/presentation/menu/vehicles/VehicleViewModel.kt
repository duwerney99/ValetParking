package com.appta.valetparking.presentation.menu.vehicles

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appta.valetparking.domain.model.VehicleModel
import com.appta.valetparking.domain.usecase.getVehicle.GetVehiclesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VehicleViewModel @Inject constructor(private val getVehiclesUseCase: GetVehiclesUseCase): ViewModel() {

    val vehicleList: MutableLiveData<List<VehicleModel>> = MutableLiveData()

    fun getVehicles() {
        viewModelScope.launch(Dispatchers.IO) {
            val listVehicles = getVehiclesUseCase()
            vehicleList.postValue(listVehicles)
        }
    }
}
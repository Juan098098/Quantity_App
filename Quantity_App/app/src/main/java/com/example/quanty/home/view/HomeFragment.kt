package com.example.quanty.home.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.example.quanty.databinding.FragmentHomeBinding
import com.example.quanty.general.BaseFragment
import com.example.quanty.home.viewmodel.HomeViewModel

//Averiguar por que funciona basandose en el modelo de Avianca
class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    //Averiguar por que se usa viewModels y no viewModel como en avianca
    //Conexion con el ViewModel
    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Se agrega esto para inflar el fragmento
        _binding = FragmentHomeBinding.bind(view)
    }
}


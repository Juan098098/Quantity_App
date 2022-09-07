package com.example.quanty.home.view

import android.os.Bundle
import android.view.View
import com.example.quanty.R


import com.example.quanty.databinding.FragmentHomeBinding
import com.example.quanty.general.BaseFragment

//Averiguar por que funciona basandose en el modelo de Avianca
class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Se agrega esto para inflar el fragmento
        _binding = FragmentHomeBinding.bind(view)
    }
}


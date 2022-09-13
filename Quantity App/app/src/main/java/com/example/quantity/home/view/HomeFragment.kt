package com.example.quantity.home.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.quantity.R
import com.example.quantity.databinding.FragmentHomeBinding
import com.example.quantity.general.BaseFragment
import com.example.quantity.home.viewmodel.HomeViewModel


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
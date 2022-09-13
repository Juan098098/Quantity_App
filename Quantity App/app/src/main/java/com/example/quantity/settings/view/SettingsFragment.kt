package com.example.quantity.settings.view

import android.os.Bundle
import android.view.View
import com.example.quantity.databinding.FragmentSettingsBinding
import com.example.quantity.general.BaseFragment


class SettingsFragment : BaseFragment<FragmentSettingsBinding>(FragmentSettingsBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Se agrega esto para inflar el fragmento
        _binding = FragmentSettingsBinding.bind(view)
    }
}
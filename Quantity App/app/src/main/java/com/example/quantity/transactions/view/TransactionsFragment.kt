package com.example.quantity.transactions.view

import android.os.Bundle
import android.view.View
import com.example.quantity.databinding.FragmentTransactionsBinding
import com.example.quantity.general.BaseFragment

class TransactionsFragment : BaseFragment<FragmentTransactionsBinding>(FragmentTransactionsBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Se agrega esto para inflar el fragmento
        _binding = FragmentTransactionsBinding.bind(view)
    }

}
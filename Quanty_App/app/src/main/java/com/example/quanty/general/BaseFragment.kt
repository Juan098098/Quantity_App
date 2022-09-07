package com.example.quanty.general


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
//Averiguar por que funciona basandose en el modelo de Avianca
typealias BindingProvider<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

open class BaseFragment<T: ViewBinding>(
    private val provideBinding: BindingProvider<T>
) : Fragment(){
    //Binding declaration
    protected var _binding: T? = null

    protected val binding get()= _binding!!

    //De la inicializacion se encarga el sistema al usar la nueva constructora del Fragment

    @CallSuper
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = provideBinding(inflater, container, false)
        return binding.root
    }
    //Liberacion del Binding
    @CallSuper
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
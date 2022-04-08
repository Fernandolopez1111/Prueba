package com.lopez.p3velocidad

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lopez.p3velocidad.databinding.FragmentPrimerBinding
import com.lopez.p3velocidad.databinding.FragmentSegundoFragmentoBinding

class PrimerFragment : Fragment() {
    private  lateinit var binding: FragmentPrimerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_primer,container,false)
        return binding.root
    }


}
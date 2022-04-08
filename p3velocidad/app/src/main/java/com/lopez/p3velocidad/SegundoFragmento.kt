package com.lopez.p3velocidad

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.lopez.p3velocidad.databinding.ActivityMainBinding
import com.lopez.p3velocidad.databinding.FragmentSegundoFragmentoBinding


class SegundoFragmento : Fragment() {
    private lateinit var binding: FragmentSegundoFragmentoBinding
    val args:SegundoFragmentoArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_segundo_fragmento,container,false)
        return  binding.root
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.greetingTextView.text = getString(R.string.Greeting_text,args.name)

    }
    }

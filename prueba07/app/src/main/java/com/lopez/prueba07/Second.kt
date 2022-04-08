package com.lopez.prueba07

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.lopez.prueba07.databinding.FragmentSecondBinding


class Second : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val viewModel: MainViewModel by activityViewModels()

    val args:SecondArgs by navArgs()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_second, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // binding.greetingTextView.text = getString(R.string.greeting_text,args.name)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        val navController = findNavController()
        binding.actionSeguir.setOnClickListener {
            val action = SecondDirections.actionSecondToResult()
            navController.navigate(action)
        }


    }
    }

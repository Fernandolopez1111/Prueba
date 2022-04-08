package com.lopez.prueba07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.lopez.prueba07.databinding.FragmentHomeBinding


class Home : Fragment() {

    private  lateinit var binding: FragmentHomeBinding
    private val  viewModel : MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        val navController = findNavController()
        binding.actionContinue.setOnClickListener {
            val  action = HomeDirections.actionHome2ToSecond()
            navController.navigate(action)
        }
          //  val action = HomeFragmentDirections.actionHomeFragmentToSecondFragment()
            //navController.navigate(action)


    }
}

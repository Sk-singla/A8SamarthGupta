package com.example.resumebuilder.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentManualAutoOptionBinding

class ManualAutoOptionFragment:Fragment(R.layout.fragment_manual_auto_option) {

    private lateinit var binding:FragmentManualAutoOptionBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentManualAutoOptionBinding.bind(view)


        binding.manualDataEntryBtn.setOnClickListener{
            findNavController().navigate(R.id.action_manualAutoOptionFragment_to_dataInputFragment)
        }


    }
}
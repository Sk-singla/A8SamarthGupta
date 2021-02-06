package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentInterestsBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class InterestsFragment:Fragment(R.layout.fragment_interests) {

    private lateinit var binding: FragmentInterestsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInterestsBinding.bind(view)

    }
}
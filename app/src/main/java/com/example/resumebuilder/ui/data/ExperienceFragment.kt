package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentExperienceBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class ExperienceFragment:Fragment(R.layout.fragment_experience) {

    private lateinit var binding: FragmentExperienceBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentExperienceBinding.bind(view)

    }
}
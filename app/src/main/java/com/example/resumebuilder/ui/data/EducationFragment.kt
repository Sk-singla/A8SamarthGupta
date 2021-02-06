package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentEducationBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class EducationFragment:Fragment(R.layout.fragment_education) {

    private lateinit var binding: FragmentEducationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentEducationBinding.bind(view)

    }
}
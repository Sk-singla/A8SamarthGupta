package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentPersonalDetailsBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class PersonalDetailsFragment:Fragment(R.layout.fragment_personal_details) {
    private lateinit var binding: FragmentPersonalDetailsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPersonalDetailsBinding.bind(view)

    }
}
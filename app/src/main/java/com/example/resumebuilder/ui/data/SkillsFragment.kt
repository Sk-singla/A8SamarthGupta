package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class SkillsFragment:Fragment(R.layout.fragment_skills){

    private lateinit var binding:FragmentSkillsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSkillsBinding.bind(view)

    }
}
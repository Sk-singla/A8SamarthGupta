package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentProjectsBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class ProjectsFragment:Fragment(R.layout.fragment_projects){

    private lateinit var binding: FragmentProjectsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProjectsBinding.bind(view)

    }
}
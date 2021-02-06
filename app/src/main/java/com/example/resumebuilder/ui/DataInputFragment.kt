package com.example.resumebuilder.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentDataInputBinding

class DataInputFragment:Fragment(R.layout.fragment_data_input) {

    private lateinit var binding: FragmentDataInputBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDataInputBinding.bind(view)

        binding.gotoPersonalDetailsBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_personalDetailsFragment)
        }
        binding.gotoAchievementsBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_achievementsFragment)
        }
        binding.gotExtraCurricularBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_extraCurricularFragment)
        }
        binding.gotoCertificatesBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_certificationFragment)
        }
        binding.gotoEducationBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_educationFragment)
        }
        binding.gotoExperienceBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_experienceFragment)
        }
        binding.gotoHobbyBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_hobbyFragment)
        }
        binding.gotoInterstsBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_interestsFragment)
        }
        binding.gotoSkillsBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_skillsFragment)
        }
        binding.gotoProjectsBtn.setOnClickListener{
            findNavController().navigate(R.id.action_dataInputFragment_to_projectsFragment)
        }

    }
}
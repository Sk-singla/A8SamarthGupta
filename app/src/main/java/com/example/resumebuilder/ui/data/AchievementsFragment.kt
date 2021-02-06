package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentAchievmentsBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class AchievementsFragment: Fragment(R.layout.fragment_achievments) {

    private lateinit var binding: FragmentAchievmentsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAchievmentsBinding.bind(view)

    }
}
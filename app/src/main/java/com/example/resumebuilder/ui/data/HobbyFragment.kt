package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentHobbyBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class HobbyFragment:Fragment(R.layout.fragment_hobby) {

    private lateinit var binding: FragmentHobbyBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHobbyBinding.bind(view)

    }
}
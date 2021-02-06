package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentExtraCurricularBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class ExtraCurricularFragment:Fragment(R.layout.fragment_extra_curricular) {
    private lateinit var binding: FragmentExtraCurricularBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentExtraCurricularBinding.bind(view)

    }
}
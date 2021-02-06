package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragementCertificationBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class CertificationFragment:Fragment(R.layout.fragement_certification) {

    private lateinit var binding: FragementCertificationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragementCertificationBinding.bind(view)

    }
}
package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentEducationBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding

class EducationFragment:Fragment(R.layout.fragment_education) {

    private lateinit var binding: FragmentEducationBinding

    companion object{
        var educationCount = 1
    }
    private var educationViewList = arrayListOf<View>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentEducationBinding.bind(view)

        binding.addEducationLayoutBtn.setOnClickListener {
            addEducationLayout()
        }
    }

    private fun addEducationLayout() {
        val educationView = layoutInflater.inflate(R.layout.education_layout,null,false)
        educationCount += 1

        educationView.findViewById<TextView>(R.id.educationTxt).text = "Qualification ${educationCount}"
        educationView.findViewById<ImageView>(R.id.deleteView).setOnClickListener {
            deleteCertificate(educationView)
        }
        educationViewList.add(educationView)
    }

    private fun deleteCertificate(v:View){
        binding.educationLinearLayout.removeView(v)
        educationCount -= 1

        // remove from array list
        educationViewList.remove(v)
        updateViews()
    }

    private fun updateViews(){
        var cnt = 1
        for (v in educationViewList){
            v.findViewById<TextView>(R.id.educationTxt).text = "Qualification $cnt"
            cnt += 1
        }
    }


}
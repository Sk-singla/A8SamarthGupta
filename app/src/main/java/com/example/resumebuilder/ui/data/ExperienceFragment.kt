package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentExperienceBinding

class ExperienceFragment:Fragment(R.layout.fragment_experience) {

    private lateinit var binding: FragmentExperienceBinding

    private var experienceViewList = arrayListOf<View>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentExperienceBinding.bind(view)
        addExperienceLayout()

        binding.addExperienceLayoutBtn.setOnClickListener {
            addExperienceLayout()
        }
    }


    private fun addExperienceLayout() {
        val experienceView = layoutInflater.inflate(R.layout.experience_layout,null,false)
        experienceView.findViewById<TextView>(R.id.experienceTxt).text = "Experience ${experienceViewList.size + 1}"
        experienceView.findViewById<ImageView>(R.id.deleteView).setOnClickListener {
            deleteCertificate(experienceView)
        }
        experienceViewList.add(experienceView)
        binding.experienceLinearLayout.addView(experienceView)
    }

    private fun deleteCertificate(v:View){
        binding.experienceLinearLayout.removeView(v)

        // remove from array list
        experienceViewList.remove(v)
        updateViews()
    }

    private fun updateViews(){
        var cnt = 1
        for (v in experienceViewList){
            v.findViewById<TextView>(R.id.experienceTxt).text = "Experience $cnt"
            cnt += 1
        }
    }
}
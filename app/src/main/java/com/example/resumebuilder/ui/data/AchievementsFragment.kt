package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentAchievmentsBinding
import com.example.resumebuilder.databinding.FragmentSkillsBinding
import com.example.resumebuilder.others.Utils

class AchievementsFragment: Fragment(R.layout.fragment_achievments) {

    private lateinit var binding: FragmentAchievmentsBinding


    var achievementViewList = arrayListOf<View>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAchievmentsBinding.bind(view)
        addAchievementLayout()

        binding.addAchievemntLayoutBtn.setOnClickListener {
            addAchievementLayout()
        }
    }

    private fun addAchievementLayout(){
        val achievementView = layoutInflater.inflate(R.layout.achievement_layout,null,false)
        achievementView.findViewById<TextView>(R.id.acheivementTxt).text = "Achievement ${achievementViewList.size + 1}"
        achievementView.findViewById<ImageView>(R.id.deleteView).setOnClickListener {
            deleteAchievement(achievementView)
        }
        achievementViewList.add(achievementView)
        binding.achievementLinearLayout.addView(achievementView)
    }

    private fun deleteAchievement(v:View){
        binding.achievementLinearLayout.removeView(v)

        // remove from array list
        achievementViewList.remove(v)
        updateViews()
    }

    private fun updateViews(){
        var cnt = 1
        for (v in achievementViewList){
            v.findViewById<TextView>(R.id.acheivementTxt).text = "Achievement $cnt"
            cnt += 1
        }
    }
}
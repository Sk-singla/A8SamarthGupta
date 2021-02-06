package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragmentExtraCurricularBinding

class ExtraCurricularFragment:Fragment(R.layout.fragment_extra_curricular) {
    private lateinit var binding: FragmentExtraCurricularBinding

    var extraCurricularViewList = arrayListOf<View>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentExtraCurricularBinding.bind(view)

        binding.addExtraCurricularLayoutBtn.setOnClickListener {
            addExtraCurricularLayout()
        }

    }

    private fun addExtraCurricularLayout(){
        val extraCurricularView = layoutInflater.inflate(R.layout.achievement_layout,null,false)
        extraCurricularView.findViewById<TextView>(R.id.extraCurricularTxt).text = "Extra Curricular ${extraCurricularViewList.size + 1}"
        extraCurricularView.findViewById<ImageView>(R.id.deleteView).setOnClickListener {
            deleteAchievement(extraCurricularView)
        }
        extraCurricularViewList.add(extraCurricularView)
        binding.extraCurricularLnrLayout.addView(extraCurricularView)
    }

    private fun deleteAchievement(v:View){
        binding.extraCurricularLnrLayout.removeView(v)

        // remove from array list
        extraCurricularViewList.remove(v)
        updateViews()
    }

    private fun updateViews(){
        var cnt = 1
        for (v in extraCurricularViewList){
            v.findViewById<TextView>(R.id.extraCurricularTxt).text = "Extra Curricular $cnt"
            cnt += 1
        }
    }
}
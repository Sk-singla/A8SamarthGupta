package com.example.resumebuilder.others

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.resumebuilder.R

object Utils {

    fun addLayout(childView: View, parentLayout:LinearLayout, textViewId:Int,text:String, deleteView: ()->Unit){

        childView.findViewById<TextView>(textViewId).text = "$text"
        childView.findViewById<ImageView>(R.id.deleteView).setOnClickListener {
            deleteView()
        }
        parentLayout.addView(childView)
    }
}
package com.example.resumebuilder.ui.data

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.resumebuilder.R
import com.example.resumebuilder.databinding.FragementCertificationBinding

class CertificationFragment:Fragment(R.layout.fragement_certification) {

    private lateinit var binding: FragementCertificationBinding


    private var certificateViewList = arrayListOf<View>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragementCertificationBinding.bind(view)

        addCertificateLayout()

        binding.addCertificateLayoutBtn.setOnClickListener {
            addCertificateLayout()
        }

    }

    private fun addCertificateLayout(){
        val certificateView = layoutInflater.inflate(R.layout.certificate_layout,null,false)
        certificateView.findViewById<TextView>(R.id.certificateTxt).text = "Certificate ${certificateViewList.size + 1}"
        certificateView.findViewById<ImageView>(R.id.deleteView).setOnClickListener {
            deleteCertificate(certificateView)
        }
        certificateViewList.add(certificateView)
        binding.certificateLinearLayout.addView(certificateView)
    }

    private fun deleteCertificate(v:View){
        binding.certificateLinearLayout.removeView(v)

        // remove from array list
        certificateViewList.remove(v)
        updateViews()
    }

    private fun updateViews(){
        var cnt = 1
        for (v in certificateViewList){
            v.findViewById<TextView>(R.id.certificateTxt).text = "Certificate $cnt"
            cnt += 1
        }
    }


}
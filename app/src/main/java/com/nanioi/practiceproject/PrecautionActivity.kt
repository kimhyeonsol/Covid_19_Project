package com.nanioi.practiceproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_precaution.*

class PrecautionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_precaution)

        precaution_link1.setOnClickListener {
            val address = "http://ncov.mohw.go.kr/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }
        precaution_link2.setOnClickListener {
            val address = "http://www.mohw.go.kr/react/index.jsp"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }
        precaution_link3.setOnClickListener {
            val address = "http://www.cdc.go.kr/index.es?sid=a2/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }
        precaution_link4.setOnClickListener {
            val address = "https://www.arcgis.com/apps/opsdashboard/index.html#/bda7594740fd40299423467b48e9ecf6"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        summary_btn.setOnClickListener {
            startActivity(Intent(this,SummaryActivity::class.java))
        }
        domestic_btn.setOnClickListener {
            startActivity(Intent(this,DomesticStatusActivity::class.java))
        }
        overseas_btn.setOnClickListener {
            startActivity(Intent(this,OverseasStatusActivity::class.java))
        }
    }
}
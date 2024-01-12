package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ncorti.slidetoact.SlideToActView

class slide_act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide)


        val slideToActView= findViewById<SlideToActView>(R.id.geser)
        slideToActView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                Log.d("ghinainas", "slide1: " + view.text + ", id: " + view.id)

                val _intent = Intent(
                    this@slide_act, halaman1::class.java
                )

                startActivity(_intent)

            }
        }
    }
}
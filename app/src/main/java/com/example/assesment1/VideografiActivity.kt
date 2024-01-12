package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VideografiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videografi)

        val btnpesan = findViewById<Button>(R.id.pesanvideo)

        btnpesan.setOnClickListener {
            val _btnpesan=
                Intent(this, orderan::class.java)
            startActivity(_btnpesan)
        }
    }
}
package com.example.assesment1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EditingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editing)

        val btnpesan = findViewById<Button>(R.id.pesanedit)

        btnpesan.setOnClickListener {
            val _btnpesan =
                Intent(this, orderan::class.java)
            startActivity(_btnpesan)
        }
    }
}
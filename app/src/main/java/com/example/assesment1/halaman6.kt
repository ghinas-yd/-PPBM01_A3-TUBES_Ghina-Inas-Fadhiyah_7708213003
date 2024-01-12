package com.example.assesment1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class halaman6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3d)

        val setting3d = findViewById<View>(R.id.pengaturan1)
        val home3d = findViewById<View>(R.id.home1)
        val listview3d = findViewById<View>(R.id.listharga1)
        val postig1 = findViewById<View>(R.id.postinstagram1)

        setting3d.setOnClickListener {
            val intent = Intent(this, halaman9::class.java)
            startActivity(intent)
        }

        listview3d.setOnClickListener {
            val intent = Intent(this, hargaActivity ::class.java)
            startActivity(intent)
        }

        home3d.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        postig1.setOnClickListener {
            val intent = Intent(this, PostActivity::class.java)
            startActivity(intent)
        }

    }
}
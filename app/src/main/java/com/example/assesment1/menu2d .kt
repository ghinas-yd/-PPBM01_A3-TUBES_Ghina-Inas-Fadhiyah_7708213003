package com.example.assesment1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class menu2d : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duadimensi)

        val buttonsetting = findViewById<View>(R.id.pengaturan2)
        val setting2d = findViewById<View>(R.id.pengaturan2)
        val home2d = findViewById<View>(R.id.home2)
        val listview2d = findViewById<View>(R.id.listview2)
        val postig2d = findViewById<View>(R.id.postinstagram2)

        setting2d.setOnClickListener {
            val intent = Intent(this, halaman9::class.java)
            startActivity(intent)
        }
        listview2d.setOnClickListener {
            val intent = Intent(this, hargaActivity ::class.java)
            startActivity(intent)
        }

        home2d.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        postig2d.setOnClickListener {
            val intent = Intent(this, PostActivity::class.java)
            startActivity(intent)
        }


        buttonsetting.setOnClickListener {
            // Navigasi ke halaman VideografiActivity ketika tombol "Videografi" ditekan
            val intent = Intent(this, halaman8::class.java)
            startActivity(intent)
        }
    }

}
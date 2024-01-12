package com.example.assesment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.assesment1.R
import com.example.assesment1.halaman6
import com.example.assesment1.halaman8
import com.example.assesment1.halaman9
import com.example.assesment1.menu2d

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman5)

        val videografiButton = findViewById<View>(R.id.videografi)
        val duaButton = findViewById<View>(R.id.dua)
        val tigaButton = findViewById<View>(R.id.tigadimensi)
        val backButton = findViewById<View>(R.id.back)
        val beranda = findViewById<View>(R.id.home)
        val listview = findViewById<View>(R.id.listharga)
        val settings = findViewById<View>(R.id.settings)
        val post = findViewById<View>(R.id.postinstagram)
        val slide = findViewById<View>(R.id.rekomendasi)

        videografiButton.setOnClickListener {
            // Navigasi ke halaman VideografiActivity ketika tombol "Videografi" ditekan
            val intent = Intent(this, halaman8::class.java)
            startActivity(intent)
        }

            settings.setOnClickListener {
            // Navigasi ke halaman VideografiActivity ketika tombol "Videografi" ditekan
            val intent = Intent(this, halaman9::class.java)
            startActivity(intent)
        }


        duaButton.setOnClickListener {
            // Navigasi ke halaman DuaDimensiActivity ketika tombol "2D" ditekan
            val intent = Intent(this, menu2d::class.java)
            startActivity(intent)
        }

        tigaButton.setOnClickListener {
            // Navigasi ke halaman TigaDimensiActivity ketika tombol "3D" ditekan
            val intent = Intent(this, halaman6::class.java)
            startActivity(intent)
        }

        beranda.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        listview.setOnClickListener {
            val intent = Intent(this, hargaActivity::class.java)
            startActivity(intent)
        }

        slide.setOnClickListener {
            val intent = Intent(this, slide_show::class.java)
            startActivity(intent)
        }


        post.setOnClickListener {
            val intent = Intent(this, PostActivity::class.java)
            startActivity(intent)
        }
    }
}

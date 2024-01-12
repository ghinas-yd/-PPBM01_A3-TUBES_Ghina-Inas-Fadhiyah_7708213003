package com.example.assesment1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class halaman8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
        val back = findViewById<Button>(R.id.backB)
        val setting = findViewById<Button>(R.id.settingVideo)
        val settingv = findViewById<View>(R.id.pengaturan3)
        val homev = findViewById<View>(R.id.home3)
        val listviewv = findViewById<View>(R.id.listharga3)
        val postig3 = findViewById<View>(R.id.postinstagram3)

        back.setOnClickListener {
            // Tambahkan kode untuk menavigasi ke halaman profil
            // Misalnya, menggunakan Intent
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        setting.setOnClickListener {
            // Navigasi ke halaman SettingActivity ketika tombol "Setting" ditekan
            val intent = Intent(this, halaman9::class.java)
            startActivity(intent)
        }

        settingv.setOnClickListener {
            val intent = Intent(this, halaman9::class.java)
            startActivity(intent)
        }

        listviewv.setOnClickListener {
            val intent = Intent(this, hargaActivity ::class.java)
            startActivity(intent)
        }

        homev.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        postig3.setOnClickListener {
            val intent = Intent(this, PostActivity::class.java)
            startActivity(intent)
        }


    }
}

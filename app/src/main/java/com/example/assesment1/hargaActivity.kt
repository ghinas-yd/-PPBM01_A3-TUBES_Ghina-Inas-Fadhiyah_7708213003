package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class hargaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harga)

        val listView: ListView = findViewById(R.id.listview3)

        // Data yang akan ditampilkan di ListView secara otomatis
        val data = arrayOf("Videografi", "Editing", "Poster", "Animasi","Banner","Kartun","3d Objek"
            ,"Kartun","Shooting", "Blender", "VR design", "Stiker","Pamflet","Spanduk","Kaos")

        // ArrayAdapter untuk menghubungkan data dengan ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)

        // Mengatur adapter untuk ListView
        listView.adapter = adapter

        // Set a click listener for items in the ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            // Handle item click here
            val selectedItem = data[position]

            // Example: Start a new activity based on the selected item
            when (selectedItem) {
                "Videografi" -> {
                    val intent = Intent(this, VideografiActivity::class.java)
                    startActivity(intent)
                }
                "Editing" -> {
                    val intent = Intent(this, EditingActivity::class.java)
                    startActivity(intent)
                }
                "Poster" -> {
                    val intent = Intent(this, PosterActivity::class.java)
                    startActivity(intent)
                }
                // Add more conditions for other items as needed
                else -> {
                    // Handle the case when none of the predefined items is selected
                }
            }
        }
    }
}
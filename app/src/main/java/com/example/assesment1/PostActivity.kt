package com.example.assesment1
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.assesment1.R

class PostActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)



        // Contoh data untuk list view
        val data = arrayOf(
            "Caption 1",
            "Caption 2",
            "Caption 3",
            // ...
        )

        // ArrayAdapter untuk menghubungkan data dengan ListView
        val adapter = ArrayAdapter(this, R.layout.activity_post, R.id.imageViewComment, data)

        // Mengatur adapter untuk ListView

    }
}

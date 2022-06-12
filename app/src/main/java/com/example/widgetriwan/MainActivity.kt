package com.example.widgetpaulniel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widgetriwan.databinding.ActivityMainBinding

// Membuat variabel binding
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)


        val getData = intent.getParcelableExtra<ModelLogin>("data")
        binding.txtUsername.text = getData?.username.toString()
        binding.txtPassword.text = getData?.password.toString()

        //Explicit Intent
        binding.btnWidget.setOnClickListener {
            val intent = Intent(this, widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicit.setOnClickListener {

            val intent = Intent(this, ImplicitIntent::class.java)
            startActivity(intent)

        }
    }
}
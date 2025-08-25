package com.example.countapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // membaca semua id dalam file XML / UI
        // nama file activity_main.xml
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        with(receiver = binding) {
            textNumber.text = number.toString()
            btnCount.setOnclickListener {
                number++
                textNumber.text = number.toString()
            }

            btnToast.setOnClickListener {
                Toast.makeText(context = this@MainActivity,
                    text = "Count $number",
                    duration = Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
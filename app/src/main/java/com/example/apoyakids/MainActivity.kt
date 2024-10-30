package com.example.apoyakids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de que este layout exista

        // Encuentra el botón y configura el listener
        val startButton: Button = findViewById(R.id.start_game_button) // Asegúrate de que este ID esté en tu layout
        startButton.setOnClickListener {
            val intent = Intent(this, PinActivity::class.java)
            startActivity(intent)
        }
    }
}

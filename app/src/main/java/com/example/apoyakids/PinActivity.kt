package com.example.apoyakids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PinActivity : AppCompatActivity() {

    private lateinit var pinInput: EditText
    private lateinit var confirmButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin) // Asegúrate de que este layout exista

        pinInput = findViewById(R.id.editTextPin) // Asegúrate de que este ID esté en tu layout
        confirmButton = findViewById(R.id.btnEnter)

        confirmButton.setOnClickListener {
            val pin = pinInput.text.toString()
            if (pin == "1234") { // Cambia esto según tu lógica de validación
                startActivity(Intent(this, GameActivity::class.java))
            } else {
                Toast.makeText(this, "PIN incorrecto", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

package com.example.apoyakids

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class ParentControlActivity : AppCompatActivity() {

    private lateinit var pinInput: EditText
    private lateinit var confirmButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent_control)

        pinInput = findViewById(R.id.pinInput)
        confirmButton = findViewById(R.id.confirmButton)

        // Cuando el usuario ingrese el PIN
        confirmButton.setOnClickListener {
            val pin = pinInput.text.toString()
            if (pin == "1234") {  // El PIN correcto es 1234
                finish()  // Cierra la actividad se supone xd
            } else {
                Toast.makeText(this, "PIN incorrecto", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

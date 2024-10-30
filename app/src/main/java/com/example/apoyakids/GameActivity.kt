package com.example.apoyakids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game) // Asegúrate de que este layout exista

        // Configura el botón para iniciar SudokuActivity
        val startSudokuButton: Button = findViewById(R.id.start_sudoku_button)
        startSudokuButton.setOnClickListener {
            startActivity(Intent(this, SudokuActivity::class.java))
        }

        // Configura el botón para iniciar TetrisActivity
        val startTetrisButton: Button = findViewById(R.id.start_tetris_button)
        startTetrisButton.setOnClickListener {
            startActivity(Intent(this, TetrisActivity::class.java))
        }
    }
}

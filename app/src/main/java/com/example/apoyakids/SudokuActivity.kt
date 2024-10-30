package com.example.apoyakids

import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SudokuActivity : AppCompatActivity() {

    private lateinit var sudokuGrid: GridLayout
    private lateinit var solveButton: Button
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sudoku)

        sudokuGrid = findViewById(R.id.sudoku_grid)
        solveButton = findViewById(R.id.solve_button)
        resetButton = findViewById(R.id.reset_button)

        initializeSudokuGrid()

        solveButton.setOnClickListener {
            solveSudoku() // Implementa la lógica para resolver Sudoku
            Toast.makeText(this, "Sudoku resuelto", Toast.LENGTH_SHORT).show()
        }

        resetButton.setOnClickListener {
            resetSudoku() // Implementa la lógica para reiniciar Sudoku
            Toast.makeText(this, "Sudoku reiniciado", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initializeSudokuGrid() {
        // Crea botones en el GridLayout para el Sudoku
        for (row in 0 until 9) {
            for (col in 0 until 9) {
                val button = Button(this)
                button.text = "" // Puedes inicializar con números si es necesario
                button.setOnClickListener {
                    // Implementa la lógica para manejar clics en celdas
                    button.text = "X" // Cambia el texto para mostrar interacción
                }
                val params = GridLayout.LayoutParams()
                params.rowSpec = GridLayout.spec(row)
                params.columnSpec = GridLayout.spec(col)
                params.width = 0
                params.height = 0
                params.setMargins(2, 2, 2, 2) // Márgenes
                button.layoutParams = params
                sudokuGrid.addView(button)
            }
        }
    }

    private fun solveSudoku() {
        // Lógica para resolver Sudoku
    }

    private fun resetSudoku() {
        // Lógica para reiniciar Sudoku
        initializeSudokuGrid() // Reinicia el grid
    }
}

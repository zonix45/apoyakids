package com.example.apoyakids;
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.apoyakids.R

class SudokuActivity : AppCompatActivity() {
    private lateinit var sudokuGrid: GridLayout
    private lateinit var solveButton: Button
    private lateinit var resetButton: Button
    private var sudokuBoard = Array(9) { IntArray(9) { 0 } }
    private var originalBoard = Array(9) { IntArray(9) { 0 } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sudoku)
        // Inicialización de los elementos
    }
}
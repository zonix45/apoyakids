package com.example.apoyakids

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TetrisActivity : AppCompatActivity() {
    private lateinit var tetrisGrid: GridLayout
    private lateinit var resetButton: Button
    private lateinit var pauseButton: Button
    private val handler = Handler(Looper.getMainLooper())

    private var isPaused = false

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Captura de excepciones
        try {
            setContentView(R.layout.activity_tetris)

            tetrisGrid = findViewById(R.id.tetris_grid)
            resetButton = findViewById(R.id.reset_button)
            pauseButton = findViewById(R.id.pause_button)

            resetButton.setOnClickListener {
                resetGame()
            }

            pauseButton.setOnClickListener {
                togglePause()
            }

            startGame()
        } catch (e: Exception) {
            e.printStackTrace() // Muestra el error en Logcat
        }
    }

    private fun startGame() {
        // Limpiar el GridLayout antes de iniciar un nuevo juego
        tetrisGrid.removeAllViews()

        // Configurar el tamaño del GridLayout
        tetrisGrid.rowCount = 20
        tetrisGrid.columnCount = 10

        // Crear y agregar un bloque de Tetris a la cuadrícula
        val block = TetrisBlock(Color.RED) // Puedes cambiar el color aquí
        val blockView = block.createView(tetrisGrid)

        // Establecer la posición del bloque
        val row = 0 // Cambia este valor según la lógica del juego
        val col = 4 // Cambia este valor según la lógica del juego
        val params = blockView.layoutParams as GridLayout.LayoutParams
        params.rowSpec = GridLayout.spec(row)
        params.columnSpec = GridLayout.spec(col)
        blockView.layoutParams = params

        // Añadir el bloque al GridLayout
        tetrisGrid.addView(blockView)

        // Mensaje de inicio del juego
        Toast.makeText(this, "Juego de Tetris iniciado", Toast.LENGTH_SHORT).show()
    }

    private fun resetGame() {
        // Lógica para reiniciar el juego
        tetrisGrid.removeAllViews() // Limpiar la cuadrícula
        startGame() // Reiniciar el juego
        Toast.makeText(this, "Juego reiniciado", Toast.LENGTH_SHORT).show()
    }

    private fun togglePause() {
        isPaused = !isPaused
        if (isPaused) {
            handler.removeCallbacksAndMessages(null) // Detener cualquier tarea programada
            Toast.makeText(this, "Juego en pausa", Toast.LENGTH_SHORT).show()
        } else {
            startGame()
            Toast.makeText(this, "Juego reanudado", Toast.LENGTH_SHORT).show()
        }
    }
}

package com.example.apoyakids;
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.apoyakids.R

class TetrisActivity : AppCompatActivity() {
    private lateinit var tetrisGrid: GridLayout
    private lateinit var resetButton: Button
    private lateinit var pauseButton: Button
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tetris)
        // Inicialización de los elementos
    }
}

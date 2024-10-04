package com.example.apoyakids

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var gameAdapter: GameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar el RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Crear la lista de juegos
        val gameList = listOf(
            Game("Juego 1", "Descripción del juego 1"),
            Game("Juego 2", "Descripción del juego 2"),
            Game("Juego 3", "Descripción del juego 3")
        )

        // Inicializar el adaptador con la lista de juegos
        gameAdapter = GameAdapter(gameList)
        recyclerView.adapter = gameAdapter
    }
}

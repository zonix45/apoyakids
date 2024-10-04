package com.example.apoyakids

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Data class para representar un Juego
data class Game(val title: String, val description: String)

class GameAdapter(private val gameList: List<Game>) :
    RecyclerView.Adapter<GameAdapter.GameViewHolder>() {

    // ViewHolder define la vista de cada elemento en el RecyclerView
    class GameViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val gameTitle: TextView = view.findViewById(R.id.gameTitle)
        val gameDescription: TextView = view.findViewById(R.id.gameDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        // Infla el diseño de cada elemento de la lista
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_game, parent, false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        // Vincula los datos del juego con la vista
        val game = gameList[position]
        holder.gameTitle.text = game.title
        holder.gameDescription.text = game.description
    }

    override fun getItemCount() = gameList.size
}

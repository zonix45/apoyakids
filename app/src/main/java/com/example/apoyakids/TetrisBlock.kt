package com.example.apoyakids

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.GridLayout
import android.widget.LinearLayout

class TetrisBlock(private val color: Int) {

    fun createView(gridLayout: GridLayout): View {
        val blockView = View(gridLayout.context)
        val size = gridLayout.width / gridLayout.columnCount // Ajustar el tamaño del bloque
        val params = LinearLayout.LayoutParams(size, size)
        blockView.layoutParams = params
        blockView.setBackgroundColor(color)
        return blockView
    }
}

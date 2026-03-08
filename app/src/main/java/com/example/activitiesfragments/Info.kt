package com.example.activitiesfragments // Ajusta el paquete según tu proyecto

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info) // Mismo layout que usaba el fragment

        // TextView del
        findViewById<TextView>(R.id.TextViewInfo).setOnClickListener {
            Toast.makeText(this, "TextView pulsado", Toast.LENGTH_SHORT).show()
        }

        // ImageView
        findViewById<ImageView>(R.id.imageViewInfo).setOnClickListener {
            Toast.makeText(this, "ImageView pulsado", Toast.LENGTH_SHORT).show()
        }

        // ProgressBar horizontal: incrementar al pulsar botón
        val progressBar = findViewById<ProgressBar>(R.id.progressBarHorizontal)
        findViewById<Button>(R.id.btnIncrementar).setOnClickListener {
            val progress = progressBar.progress
            if (progress < progressBar.max) {
                progressBar.progress = progress + 10
            } else {
                progressBar.progress = 0
            }
            Toast.makeText(this, "Progreso: ${progressBar.progress}", Toast.LENGTH_SHORT).show()
        }

        // ProgressBar circular
        findViewById<ProgressBar>(R.id.progressBarCircular).setOnClickListener {
            Toast.makeText(this, "ProgressBar circular", Toast.LENGTH_SHORT).show()
        }
    }
}
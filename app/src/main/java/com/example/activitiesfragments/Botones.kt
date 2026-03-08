package com.example.activitiesfragments

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Botones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)

        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(this, "Botón normal pulsado", Toast.LENGTH_SHORT).show()
        }

        findViewById<ImageButton>(R.id.imageButton2).setOnClickListener {
            Toast.makeText(this, "ImageButton pulsado", Toast.LENGTH_SHORT).show()
        }

        findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener {
            Toast.makeText(this, "FAB pulsado", Toast.LENGTH_SHORT).show()
        }
    }
}
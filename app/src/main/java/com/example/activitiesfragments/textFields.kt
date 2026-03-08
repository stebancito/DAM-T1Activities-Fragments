package com.example.activitiesfragments

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class textFields : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_fields)

        val textView = findViewById<TextView>(R.id.textView2)
        textView.setOnClickListener {
            Toast.makeText(this, "TextView pulsado", Toast.LENGTH_SHORT).show()
        }

        val checkedTextView = findViewById<CheckedTextView>(R.id.checkedTextView)
        checkedTextView.setOnClickListener {
            checkedTextView.isChecked = !checkedTextView.isChecked
            val estado = if (checkedTextView.isChecked) "marcado" else "desmarcado"
            Toast.makeText(this, "CheckedTextView $estado", Toast.LENGTH_SHORT).show()
        }
    }
}
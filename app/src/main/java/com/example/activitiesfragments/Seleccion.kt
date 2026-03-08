package com.example.activitiesfragments

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class Seleccion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion)

        // Chips
        val chipGroup = findViewById<ChipGroup>(R.id.chipGroup)
        for (i in 0 until chipGroup.childCount) {
            val chip = chipGroup.getChildAt(i) as? Chip
            chip?.setOnClickListener {
                Toast.makeText(this, "Chip: ${chip.text}", Toast.LENGTH_SHORT).show()
            }
        }

        // CheckBox
        findViewById<CheckBox>(R.id.checkBox).setOnCheckedChangeListener { _, isChecked ->
            val estado = if (isChecked) "marcado" else "desmarcado"
            Toast.makeText(this, "CheckBox $estado", Toast.LENGTH_SHORT).show()
        }

        // RadioGroup
        findViewById<RadioGroup>(R.id.radioGroup).setOnCheckedChangeListener { _, checkedId ->
            val radio = findViewById<RadioButton>(checkedId)
            Toast.makeText(this, "Opción seleccionada: ${radio.text}", Toast.LENGTH_SHORT).show()
        }

        // ToggleButton
        findViewById<ToggleButton>(R.id.toggleButton2).setOnCheckedChangeListener { _, isChecked ->
            val estado = if (isChecked) "encendido" else "apagado"
            Toast.makeText(this, "ToggleButton $estado", Toast.LENGTH_SHORT).show()
        }

        // Switch
        findViewById<Switch>(R.id.switch1).setOnCheckedChangeListener { _, isChecked ->
            val estado = if (isChecked) "activado" else "desactivado"
            Toast.makeText(this, "Switch $estado", Toast.LENGTH_SHORT).show()
        }

        // RatingBar
        findViewById<RatingBar>(R.id.ratingBar).setOnRatingBarChangeListener { _, rating, _ ->
            Toast.makeText(this, "Puntuación: $rating", Toast.LENGTH_SHORT).show()
        }

        // SeekBar
        findViewById<SeekBar>(R.id.seekBar).setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    Toast.makeText(this@Seleccion, "Valor: $progress", Toast.LENGTH_SHORT).show()
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
}

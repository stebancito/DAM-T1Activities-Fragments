package com.example.activitiesfragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class f_prev_textfields : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_f_prev_textfields, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnAbrir = view.findViewById<Button>(R.id.btnAbrirActivitytf)
        btnAbrir.setOnClickListener {
            startActivity(Intent(requireActivity(), textFields::class.java))
        }
    }
}
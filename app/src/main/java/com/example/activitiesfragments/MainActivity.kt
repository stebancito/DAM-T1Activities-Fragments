package com.example.activitiesfragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import com.example.activitiesfragments.f_bienvenida
import com.example.activitiesfragments.f_prev_botones
import com.example.activitiesfragments.f_prev_info
import com.example.activitiesfragments.f_prev_listas
import com.example.activitiesfragments.f_prev_seleccion
import com.example.activitiesfragments.f_prev_textfields
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        if (savedInstanceState == null) {
            loadFragment(f_bienvenida())
            bottomNavigationView.selectedItemId = R.id.home
        }

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    loadFragment(f_bienvenida())
                    true
                }
                R.id.navigation_textfields -> {
                    loadFragment(f_prev_textfields())
                    true
                }
                R.id.navigation_buttons -> {
                    loadFragment(f_prev_botones())
                    true
                }
                R.id.navigation_selection -> {
                    loadFragment(f_prev_seleccion())
                    true
                }
                R.id.navigation_lists -> {
                    loadFragment(f_prev_listas())
                    true
                }
                R.id.navigation_info -> {
                    loadFragment(f_prev_info())
                    true
                }
                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
package com.example.activitiesfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Listas : AppCompatActivity() {

    private val frutas = listOf("Manzana", "Banana", "Naranja", "Uva", "Pera", "Sandía")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listas)

        // LISTVIEW
        val listView = findViewById<ListView>(R.id.listViews)
        val adaptadorListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, frutas)
        listView.adapter = adaptadorListView
        listView.setOnItemClickListener { _, _, posicion, _ ->
            val frutaSeleccionada = frutas[posicion]
            Toast.makeText(this, "ListView: $frutaSeleccionada", Toast.LENGTH_SHORT).show()
        }

        // SPINNER
        val spinner = findViewById<Spinner>(R.id.spinnerr)
        val adaptadorSpinner = ArrayAdapter(this, android.R.layout.simple_spinner_item, frutas)
        adaptadorSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptadorSpinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, posicion: Int, id: Long) {
                val frutaSeleccionada = frutas[posicion]
                Toast.makeText(this@Listas, "Spinner: $frutaSeleccionada", Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        // RECYCLERVIEW
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerVieww)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
                val vista = LayoutInflater.from(parent.context)
                    .inflate(android.R.layout.simple_list_item_1, parent, false)
                return object : RecyclerView.ViewHolder(vista) {}
            }

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                val texto = holder.itemView.findViewById<TextView>(android.R.id.text1)
                texto.text = frutas[position]
                holder.itemView.setOnClickListener {
                    Toast.makeText(this@Listas, "RecyclerView: ${frutas[position]}", Toast.LENGTH_SHORT).show()
                }
            }

            override fun getItemCount() = frutas.size
        }

        // EXPANDABLELISTVIEW
        val expandableListView = findViewById<ExpandableListView>(R.id.expandableListVieww)
        val grupos = listOf("Frutas", "Verduras")
        val hijos = mapOf(
            "Frutas" to listOf("Manzana", "Banana", "Naranja"),
            "Verduras" to listOf("Zanahoria", "Lechuga", "Tomate")
        )

        val adaptadorExpandable = object : BaseExpandableListAdapter() {
            override fun getGroupCount(): Int = grupos.size
            override fun getChildrenCount(groupPosition: Int): Int =
                hijos[grupos[groupPosition]]?.size ?: 0
            override fun getGroup(groupPosition: Int): Any = grupos[groupPosition]
            override fun getChild(groupPosition: Int, childPosition: Int): Any =
                hijos[grupos[groupPosition]]?.get(childPosition) ?: ""
            override fun getGroupId(groupPosition: Int): Long = groupPosition.toLong()
            override fun getChildId(groupPosition: Int, childPosition: Int): Long = childPosition.toLong()
            override fun hasStableIds(): Boolean = false

            override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
                val vista = convertView ?: LayoutInflater.from(this@Listas)
                    .inflate(android.R.layout.simple_expandable_list_item_1, parent, false)
                vista.findViewById<TextView>(android.R.id.text1).text = grupos[groupPosition]
                return vista
            }

            override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
                val vista = convertView ?: LayoutInflater.from(this@Listas)
                    .inflate(android.R.layout.simple_list_item_1, parent, false)
                val texto = vista.findViewById<TextView>(android.R.id.text1)
                texto.text = hijos[grupos[groupPosition]]?.get(childPosition) ?: ""
                return vista
            }

            override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean = true
        }
        expandableListView.setAdapter(adaptadorExpandable)
        expandableListView.setOnChildClickListener { _, _, groupPosition, childPosition, _ ->
            val elemento = hijos[grupos[groupPosition]]?.get(childPosition) ?: ""
            Toast.makeText(this, "Expandable: $elemento", Toast.LENGTH_SHORT).show()
            true
        }
    }
}
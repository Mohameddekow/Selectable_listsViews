package com.example.lists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lists = arrayOf("lions", "cats", "pets","shops", "wholesales"," retails", "animals")

        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lists)

        listView.setOnItemClickListener { parent, view, position, id ->

//            start a new activity on clicking on the first item
            if(position == 0){
                startActivity(Intent(applicationContext, Lions::class.java))
            }

//            make a toast on clicking a list items
            Toast.makeText(applicationContext, "you clicked " + lists[position], Toast.LENGTH_SHORT).show()
        }
    }
}
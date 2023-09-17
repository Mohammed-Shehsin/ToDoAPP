package com.shehsin0.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val showBtn = findViewById<Button>(R.id.showBtn)
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        addBtn.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, firstFragment)
//                addToBackStack(null)
                commit()
            }
        }
        showBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, secondFragment)
//                addToBackStack(null)
                commit()
            }
        }
    }
    }
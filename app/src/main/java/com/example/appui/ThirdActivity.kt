package com.example.appui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class ThirdActivity : AppCompatActivity() {

    private lateinit var button2:AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third2)

        button2=findViewById(R.id.button2)

        button2.setOnClickListener {
            Toast.makeText(applicationContext,"Card View",Toast.LENGTH_SHORT).show()
            val intent=Intent(this@ThirdActivity,CardView::class.java)
            startActivity(intent)
        }
    }
}
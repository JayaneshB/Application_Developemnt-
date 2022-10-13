package com.example.appui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.*
import androidx.appcompat.widget.AppCompatButton

class SecondActivity : AppCompatActivity() {
    val tag=SecondActivity::class.java.simpleName
    private lateinit var secondActivityButton:AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        secondActivityButton=findViewById(R.id.secondActivityButton)

        secondActivityButton.setOnClickListener {
            Toast.makeText(applicationContext,"Directing to next page",Toast.LENGTH_SHORT).show()
            val intent=Intent(this@SecondActivity,ThirdActivity::class.java)
            startActivity(intent)
        }

        val actionBar=supportActionBar
        if(actionBar != null ){
            actionBar.title="Second Activity"
        }
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
        Log.d(tag,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag,"onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag,"onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"onDestroy")
    }
}
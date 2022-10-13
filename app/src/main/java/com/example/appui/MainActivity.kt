package com.example.appui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    val tagName = MainActivity::class.java.simpleName
    private lateinit var btGo: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btGo = findViewById(R.id.btGo)
        btGo.setOnClickListener {
            val intent =  Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }
        Log.d(tagName,"onCreate")
    }

    override fun onResume() {
        super.onResume()
        // Displays as a Error -> Log.e
        Log.w(tagName,"onResume")
    }

    override fun onPause() {
        super.onPause()
        //Displays as a debug -> Log.d
        Log.d(tagName,"onPause")
    }

    override fun onStop() {
        super.onStop()
        // Displays as Warning -> Log.w
        Log.d(tagName,"OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        //Displays as an information -> Log.i
        Log.d(tagName,"OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        //Displays as a verbose -> Log.v
        Log.d(tagName,"OnDestroy")
    }
}
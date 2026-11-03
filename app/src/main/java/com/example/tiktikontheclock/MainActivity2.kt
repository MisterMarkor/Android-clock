package com.example.tiktikontheclock

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val name = findViewById<EditText>(R.id.YourNameedit)
        val naam = name.text.toString();
        val NextbuttonP2 = findViewById<ImageButton>(R.id.NextButtonP2)
        NextbuttonP2.setOnClickListener {
            Toast.makeText(this, "(cuz he is da goat)", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }

        val BackButtonP2 = findViewById<ImageButton>(R.id.BackButtonP2)
        BackButtonP2.setOnClickListener {

            Toast.makeText(this, "(max is een geit)", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
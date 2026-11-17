package com.example.tiktikontheclock

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val name = findViewById<TextView>(R.id.NameInBoxp3)
        val tijd = findViewById<TextView>(R.id.TimeInBoxp3)
        val mail = findViewById<TextView>(R.id.EmailInBoxp3)
        val naam = intent.getStringExtra("naam").toString();
        val time = intent.getStringExtra("time").toString();
        val email = intent.getStringExtra("email").toString();
        name.text = "$naam"
        tijd.text = "$time"
        mail.text = "$email"

        val nextbuttonP3 = findViewById<ImageButton>(R.id.NextButtonP3)
        val backButtonP3 = findViewById<ImageButton>(R.id.BackButtonP3)

        nextbuttonP3.setOnClickListener {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("time", time)

            startActivity(intent)

        }

        backButtonP3.setOnClickListener {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

    }
}
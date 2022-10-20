package com.example.tugas2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var button1: Button
        lateinit var button2: Button
        button1 = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button1.setOnClickListener {
            val detail = game(
                "Monster Hunter World",
                "Capcom"
            )
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra(MainActivity2.extra_games, detail)
            intent.putExtra(MainActivity2.extra_bool, true)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val phoneNumber = "08116551101"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }
    }
}
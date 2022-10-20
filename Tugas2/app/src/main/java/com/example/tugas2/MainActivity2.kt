package com.example.tugas2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        lateinit var Biodatagame: TextView
        val getbool = intent.getBooleanExtra(extra_bool, false)
        Biodatagame = findViewById(R.id.textView)
        if(getbool == true) {
            val getgames = intent.getParcelableExtra<game>(extra_games)
            Log.i("TAG", getgames?.name.toString())
            val detail = "Detail game: \n" +
                    "\nName: ${getgames?.name.toString()} " +
                    "\nPublisher: ${getgames?.publisher.toString()} "
            Biodatagame.text = detail
        }
    }
    companion object{
        const val extra_text = "extra_text"
        const val extra_bool = "extra_bool"
        const val extra_games = "extra_games"
    }
}

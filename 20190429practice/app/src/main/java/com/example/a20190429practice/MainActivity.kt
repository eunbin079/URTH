package com.example.a20190429practice

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMainLogin.setOnClickListener {
            val intent:Intent=Intent(this,LoginActivity::class.java)
            intent.putExtra("id",1)
            startActivity(intent)

        }
        btnMainExit.setOnClickListener {
            finish()
        }

    }
}

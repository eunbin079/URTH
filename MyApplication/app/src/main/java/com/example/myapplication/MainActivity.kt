package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMainLogin.setOnClickListener {

            Toast.makeText(this,"Login button is clicked",Toast.LENGTH_SHORT).show()
            toast("loggin button is clicked")

        }


    }
}

package com.example.a20190504

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     btnMainLogin.setOnClickListener {
         startActivity<LoginActivity>("id" to 1)
     }
        btnMainClose.setOnClickListener {
            finish()
        }
     }
}

package com.example.a20190429practice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val id=intent.getIntExtra("id",1)

        Toast.makeText(this,"id: ${id}",Toast.LENGTH_SHORT).show()

    }
}

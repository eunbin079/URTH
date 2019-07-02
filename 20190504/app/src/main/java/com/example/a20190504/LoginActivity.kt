package com.example.a20190504

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val id=intent.getIntExtra("id",1)

        toast("id:${id}")
        edtLoginID.setOnFocusChangeListener{ v, hasFocus ->
            if(hasFocus)v.setBackgroundResource(R.drawable.primary_border)

            else v.setBackgroundResource(R.drawable.gray_border)
        }
        editLoginPW.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus)v.setBackgroundResource(R.drawable.primary_border)
            else v.setBackgroundResource(R.drawable.gray_border)
        }
    }
}

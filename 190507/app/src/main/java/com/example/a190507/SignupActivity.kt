package com.example.a190507

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signup.*
import org.jetbrains.anko.toast
import java.text.SimpleDateFormat
import java.util.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val s_time=intent.getStringExtra("start_time")

        toast("Current time: ${s_time}")

        btnSignup.setOnClickListener {
            val signup_u_name:String =edtSignupName.text.toString()
            val signup_u_ID:String=edtSignupID.text.toString()
            val signup_u_PW:String=edtSignupPW.text.toString()
            if(isValid(signup_u_ID,signup_u_PW,signup_u_name))
            {
                postSignupResponse(signup_u_ID,signup_u_PW,signup_u_name)
            }

        }
    }

    fun isValid(u_id:String,u_pw:String,u_name:String):Boolean{
        return true
    }

    fun postSignupResponse(u_id:String,u_pw:String,u_name:String){

        val simpleDateFormat = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        val e_time=simpleDateFormat.format(Date())

        val intent:Intent=Intent()

        intent.putExtra("end_time",e_time)
        setResult(Activity.RESULT_OK,intent)

        finish()


    }
}

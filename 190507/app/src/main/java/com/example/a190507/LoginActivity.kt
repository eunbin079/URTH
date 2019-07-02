package com.example.a190507

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.toast
import java.text.SimpleDateFormat
import java.util.*

class LoginActivity : AppCompatActivity() {
    val REQUEST_CODE_LOGIN_ACTIVIT=1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        txtLoginSignup.setOnClickListener{
            val simpleDateFormat =SimpleDateFormat("dd/M/yyyy hh:mm:ss")
            val s_time=simpleDateFormat.format(Date())

            startActivityForResult<SignupActivity>(REQUEST_CODE_LOGIN_ACTIVIT, "start_time" to s_time)

        }
        btnLogin.setOnClickListener {
            val Login_u_id:String=edtLoginID.text.toString()
            val Login_u_pw:String=edtLoginPW.text.toString()
            if(isValid(Login_u_id,Login_u_pw)){
                postLoginResponse(Login_u_id)

            }

        }

    }
    override fun onActivityResult(requestCode:Int,resultCode:Int,data : Intent?){
        super.onActivityResult(requestCode,resultCode,data)

        if (requestCode==REQUEST_CODE_LOGIN_ACTIVIT){
            if(resultCode==Activity.RESULT_OK){
                val e_time=data!!.getStringExtra("end_time")
                toast("End time: ${e_time}")
            }
        }


    }
    fun isValid(u_id:String,u_pw:String):Boolean{
        return true
    }
    fun postLoginResponse(u_id:String){
    SharedPreferenceController.setUserID(this,u_id)

        finish()
    }
}

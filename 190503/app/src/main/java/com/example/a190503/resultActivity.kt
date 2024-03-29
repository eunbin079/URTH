package com.example.a190503

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class resultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val height=intent.getStringExtra("height").toInt()
        val weight=intent.getStringExtra("weight").toInt()

        val bmi=weight/Math.pow(height/100.0,2.0)

        when{
            bmi>=35->resultTextView.text="고도비만"
            bmi>=30->resultTextView.text="2단계비만"
            bmi>=25->resultTextView.text="1단계비만"
            bmi>=23->resultTextView.text="과체중"
            bmi>=18.5->resultTextView.text="정상"
            else->resultTextView.text="저체중"

        }
        when{
            bmi>=23->imageView.setImageResource(R.drawable.ic_sentiment_very_dissatisfied_black_24dp)
            bmi>=18.5->imageView.setImageResource(R.drawable.ic_sentiment_neutral_black_24dp)
            else->imageView.setImageResource(R.drawable.ic_insert_emoticon_black_24dp)
        }
        Toast.makeText(this,"$bmi",Toast.LENGTH_SHORT).show()
    }
}

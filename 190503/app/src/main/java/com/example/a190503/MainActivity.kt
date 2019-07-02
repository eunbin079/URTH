package com.example.a190503

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private fun saveData(height:Int,weight:Int)
    {
        val pref=PreferenceManager.getDefaultSharedPreferences(this)
        val editor=pref.edit()

        editor.putInt("KEY_HEIGHT",height)
            .putInt("KEY_WEIGHT",weight)
            .apply()
    }
    private  fun loadData()
    {
        val pref=PreferenceManager.getDefaultSharedPreferences(this)
        val height=pref.getInt("KEY_HEIGHT",0)
        val weight=pref.getInt("KEY_WEIHGT",0)

        if(height!=0&&weight!=0)
        {
            heigtEditText.setText(height.toString())
            weightEditText.setText(weight.toString())
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        resultButton.setOnClickListener {
            saveData(heigtEditText.text.toString().toInt(),weightEditText.text.toString().toInt())
           startActivity<resultActivity>(
               "weight" to weightEditText.text.toString(),
               "height" to heigtEditText.text.toString()
           )
        }
    }
}

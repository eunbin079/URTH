package com.example.urth.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.urth.Adapter.MychallengeRecyclerViewAdapter
import com.example.urth.Data.MychallengeData
import com.example.urth.R
import kotlinx.android.synthetic.main.activity_mychallenge.*

class MychallengeActivity : AppCompatActivity() {

    lateinit var mychallengeRecyclerViewAdapter:MychallengeRecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mychallenge)

        var dataList:ArrayList<MychallengeData> = ArrayList()
        dataList.add(
            MychallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "챌린지 1",120))
        dataList.add(
            MychallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "챌린지 2", 100))
        dataList.add(
            MychallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "챌린지 3", 99))
        dataList.add(MychallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "챌린지 4", 10))

        mychallengeRecyclerViewAdapter= MychallengeRecyclerViewAdapter(this ,dataList)
        rv_mychallenge.adapter=mychallengeRecyclerViewAdapter
        rv_mychallenge.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)



    }
}

package com.example.urth.Fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.urth.Activity.MychallengeActivity
import com.example.urth.R
import kotlinx.android.synthetic.main.fragment_timeline.*


class TimelineFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_timeline, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        txt_TimlineFragment_click.setOnClickListener {
            val intent:Intent= Intent(activity,MychallengeActivity::class.java)
            startActivity(intent)
        }

    }






}

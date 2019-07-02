package com.example.urth.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.urth.Fragment.ChallengeFragment
import com.example.urth.Fragment.HomeFragment
import com.example.urth.Fragment.MypageFragment
import com.example.urth.Fragment.TimelineFragment

class ProductMainPagerAdapter(fm:FragmentManager,private val num_fragment:Int):FragmentStatePagerAdapter(fm){
    companion object {
        private  var homeFragment:HomeFragment?=null
        private var challengeFragment:ChallengeFragment?=null
        private var timelineFragment:TimelineFragment?=null
        private var mypageFragment:MypageFragment?=null

        @Synchronized
        fun getHomeFragment():HomeFragment{
            if (homeFragment==null) homeFragment= HomeFragment()
            return homeFragment!!
        }
        @Synchronized
        fun getChallengeFragment():ChallengeFragment{
            if (challengeFragment==null) challengeFragment= ChallengeFragment()
            return challengeFragment!!
        }
        @Synchronized
        fun getTimelineFragment():TimelineFragment{
            if (timelineFragment==null) timelineFragment= TimelineFragment()
            return timelineFragment!!
        }
        @Synchronized
        fun getMypageFragment():MypageFragment{
            if (mypageFragment==null) mypageFragment= MypageFragment()
            return mypageFragment!!
        }
    }
    override fun getItem(p0: Int): Fragment ?{
        return when(p0)
        {
            0-> getHomeFragment()
            1-> getChallengeFragment()
            2-> getTimelineFragment()
            3-> getMypageFragment()
            else->null
        }

    }

    override fun getCount(): Int {
        return num_fragment
         }

}

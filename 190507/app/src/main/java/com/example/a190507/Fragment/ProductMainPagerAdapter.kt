package com.example.a190507.Fragment

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.a190507.AllProductMainFragment
import com.example.a190507.NewProductMainFrgment

class ProductMainPagerAdapter (fm :FragmentManager,private val num_fragment : Int):FragmentStatePagerAdapter(fm){
    override fun getItem(p0: Int): Fragment? {
        return when(p0)
        {
            0->AllProductMainFragment()
            1->NewProductMainFrgment()
            2->EndProductMainFragment()
            else->null
        }

    }

    override fun getCount(): Int {
        return num_fragment
    }
}
package com.example.a190507

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import com.example.a190507.Fragment.ProductMainPagerAdapter
import kotlinx.android.synthetic.main.activity_first.*
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.toast
import java.text.SimpleDateFormat
import java.util.*

class FirstActivity : AppCompatActivity() {
    val REQUEST_CODE_FIRST_ACTIVITY=100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        configureMainTab()

        btnFirstLogin.setOnClickListener{
            val simpleDateFormat =SimpleDateFormat("dd/M/yyyy hh:mm:ss")
            val s_time=simpleDateFormat.format(Date())

            startActivityForResult<LoginActivity>(REQUEST_CODE_FIRST_ACTIVITY,"STArt_time" to s_time)
        }

    }
    override fun onActivityResult(requestCode:Int,resultCode:Int,data : Intent?){
        super.onActivityResult(requestCode,resultCode,data)

        if (requestCode==REQUEST_CODE_FIRST_ACTIVITY){
            if(resultCode== Activity.RESULT_OK){
                val Login_u_ID:String=data!!.getStringExtra("Login_u_ID")
                toast("환영합니다. ${Login_u_ID} 님")
            }
        }

    }

    private fun configureMainTab()
    {
    vp_main_product.adapter=ProductMainPagerAdapter(supportFragmentManager,3)
        vp_main_product.offscreenPageLimit=2
        tl_main_category.setupWithViewPager(vp_main_product)

        val navCategoryMainLayout: View =(this.getSystemService(android.content.Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater)
            .inflate(R.layout.navigation_category_main,null,false)

        tl_main_category.getTabAt(0)!!.customView=navCategoryMainLayout.findViewById(R.id.rl_nav_category_main_all) as RelativeLayout
        tl_main_category.getTabAt(1)!!.customView=navCategoryMainLayout.findViewById(R.id.rl_nav_category_main_new) as RelativeLayout
    tl_main_category.getTabAt(2)!!.customView=navCategoryMainLayout.findViewById(R.id.rl_nav_category_main_end) as RelativeLayout

    }
}

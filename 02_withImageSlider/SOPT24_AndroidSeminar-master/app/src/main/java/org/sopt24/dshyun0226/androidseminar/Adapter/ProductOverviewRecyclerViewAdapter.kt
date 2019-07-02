package org.sopt24.dshyun0226.androidseminar.Adapter

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.rv_item_product_overview.view.*
import org.sopt24.dshyun0226.androidseminar.Data.ProductOverviewData
import org.sopt24.dshyun0226.androidseminar.R

class ProductOverviewRecyclerViewAdapter(val ctx:Context,var dataList:ArrayList<ProductOverviewData>):RecyclerView.Adapter<ProductOverviewRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup,viewType: Int): Holder {
        val view:View=LayoutInflater.from(ctx).inflate(R.layout.rv_item_product_overview,viewGroup,false)
        return Holder(view)
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int=dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
       Glide.with(ctx).load(dataList[position].img_url).into(holder.img_thumbnail)
        holder.title.text=dataList[position].title
        holder.num_like.text="♥"+dataList[position].num_like.toString()//To change body of created functions use File | Settings | File Templates.
        holder.author.text=dataList[position].author
    }

    inner class Holder(itemView: View):RecyclerView.ViewHolder(itemView){
        var img_thumbnail=itemView.findViewById(R.id.img_rv_item_product_overview_thumbnail)as ImageView
       var title=itemView.findViewById(R.id.txt_rv_item_product_overview_title)as TextView
        var num_like=itemView.findViewById(R.id.txt_rv_item_product_overview_numlike)as TextView
        var author=itemView.findViewById(R.id.txt_rv_item_product_overview_author)as TextView

    }}
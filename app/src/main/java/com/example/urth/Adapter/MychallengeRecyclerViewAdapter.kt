package com.example.urth.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.urth.Data.MychallengeData
import com.example.urth.R

class MychallengeRecyclerViewAdapter(val ctx:Context,val dataList: ArrayList<MychallengeData>): RecyclerView.Adapter <MychallengeRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup:  ViewGroup, viewType: Int): Holder {
        val view:View=LayoutInflater.from(ctx).inflate(R.layout.rv_item_mychallenge, viewGroup ,false)
        return Holder(view)
      }

    override fun getItemCount(): Int {
        return dataList.size
  }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].img_url)
            .into(holder.img_thumbnail)
        holder.title.text=dataList[position].title
        holder.numofAuth.text=dataList[position].numofAuth.toString()+"회 인증"

    }

    inner class Holder(itemView: View):RecyclerView.ViewHolder(itemView){
        var img_thumbnail=itemView.findViewById(R.id.img_rv_item_mychallenge_thumbnail) as ImageView
        var title=itemView.findViewById(R.id.txt_rv_item_mychallenge_title) as TextView
        var numofAuth=itemView.findViewById(R.id.txt_rv_item_mychallenge_numofAuth) as TextView
    }
}
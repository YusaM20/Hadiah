package com.example.tugas.RecycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas.R

class adapter(private val itemlist : ArrayList<item>) :
    RecyclerView.Adapter<adapter.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

         val itemView = LayoutInflater.from(parent.context).inflate(
             R.layout.item_seclt,
             parent,false)

        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = itemlist[position]
        holder.titleImage.setImageResource(currentitem.titleImage)

    }

    override fun getItemCount(): Int {


        return itemlist.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val titleImage : ImageView = itemView.findViewById(R.id.title_image)

    }
}
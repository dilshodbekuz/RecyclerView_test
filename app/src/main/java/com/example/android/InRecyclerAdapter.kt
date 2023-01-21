package com.example.android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.databinding.InItemBinding

class InRecyclerAdapter(val string: String):RecyclerView.Adapter<InRecyclerAdapter.ViewHolder>() {

    private lateinit var listener:OnItemClick
    class ViewHolder(val binding: InItemBinding) : RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(InItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.itemView.context).load("https://i.imgur.com/DvpvklR.png").into(holder.binding.image)
        holder.binding.card.setOnClickListener {
            listener.onItemClick(string[position])
        }
    }

    override fun getItemCount(): Int {
       return string.count()
    }
}
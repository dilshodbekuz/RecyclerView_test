package com.example.android

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.databinding.ItemRvBinding

class RecylerViewAdapter(val providers: List<Provider>) :
    RecyclerView.Adapter<RecylerViewAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemRvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val provider = providers[position]
        holder.binding.title.setText(provider.getCategoryTitle)
        holder.binding.inRv.layoutManager =
            LinearLayoutManager(holder.binding.inRv.context, LinearLayoutManager.HORIZONTAL, false)
        val inRecyclerAdapter = InRecyclerAdapter(provider.toString())
        holder.binding.inRv.adapter = inRecyclerAdapter
        holder.binding.inRv.setOnClickListener {
            val intent = Intent(holder.binding.inRv.context, MainActivity2::class.java)
            intent.putExtra("img",toString())
            holder.binding.inRv.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return providers.size
    }
}
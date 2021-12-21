package com.example.recyclerandpaging

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class RecyclerAdapter(private val nameList : ArrayList<String> , private val phoneList : ArrayList<String> , private val emailList : ArrayList<String>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_view,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = nameList[position]
        holder.phone.text = phoneList[position]
        holder.email.text = emailList[position]
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.nameTextView)
        val phone : TextView = itemView.findViewById(R.id.phoneTextView)
        val email: TextView = itemView.findViewById(R.id.emailTextView)
    }
}
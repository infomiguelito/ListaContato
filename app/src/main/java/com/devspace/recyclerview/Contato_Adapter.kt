package com.devspace.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class Contato_Adapter :
    ListAdapter <class_contato,Contato_Adapter.ContactViewHolder>(ContactDifuilts()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        val contact = getItem(position)
        holder.bind(contact)

    }

    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val tvName = view.findViewById<TextView>(R.id.tv_name)
        private val tvPhone = view.findViewById<TextView>(R.id.tv_phone)
        private val image = view.findViewById<ImageView>(R.id.image)

        fun bind(contact:class_contato){
            tvName.text = contact.name
            tvPhone.text = contact.phone
            image.setImageResource(contact.icno)
        }

    }

    class ContactDifuilts : DiffUtil.ItemCallback<class_contato>() {
        override fun areItemsTheSame(oldItem: class_contato, newItem: class_contato): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: class_contato, newItem: class_contato): Boolean {
            return oldItem.name == newItem.name
        }

    }


}

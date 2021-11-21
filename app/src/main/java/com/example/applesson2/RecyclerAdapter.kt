package com.example.applesson2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    val contacts = arrayOf(Contact("Contact 1", "profession"), Contact("Contact 2", "profession"),
        Contact("Contact 3", "profession"), Contact("Contact 4", "profession"), Contact("Contact 5", "profession"),
        Contact("Contact 6", "profession"), Contact("Contact 7", "profession"), Contact("Contact 8", "profession"),
        Contact("Contact 9", "profession"), Contact("Contact 10", "profession"), Contact("Contact 11", "profession"), )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.contactName.text = contacts[position].name
        holder.contactProfession.text = contacts[position].profession
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    inner class ViewHolder(contactView: View): RecyclerView.ViewHolder(contactView) {
        var contactImage: ImageView
        var contactName: TextView
        var contactProfession: TextView

        init {
            contactImage = contactView.findViewById(R.id.contact_photo)
            contactName = contactView.findViewById(R.id.contact_name)
            contactProfession = contactView.findViewById(R.id.contact_profession)
        }
    }
}
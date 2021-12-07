package com.example.applesson2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private var contacts: List<Contact>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var contactImage: ImageView = itemView.findViewById(R.id.contact_photo)
        var contactName: TextView? = itemView.findViewById(R.id.contact_name)
        var contactProfession: TextView? = itemView.findViewById(R.id.contact_profession)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.contactImage.downloadImage(contacts[position].userImage)
        holder.contactName?.text = contacts[position].name
        holder.contactProfession?.text = contacts[position].profession
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    fun refreshContacts(contacts: List<Contact>){
        this.contacts = contacts
        notifyDataSetChanged()
    }

}

//class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
//
//    val contacts = arrayOf(Contact("Contact 1", "profession"), Contact("Contact 2", "profession"),
//        Contact("Contact 3", "profession"), Contact("Contact 4", "profession"), Contact("Contact 5", "profession"),
//        Contact("Contact 6", "profession"), Contact("Contact 7", "profession"), Contact("Contact 8", "profession"),
//        Contact("Contact 9", "profession"), Contact("Contact 10", "profession"), Contact("Contact 11", "profession"), )
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
//        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
//        return ViewHolder(v)
//    }
//
//    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
//        holder.contactName.text = contacts[position].name
//        holder.contactProfession.text = contacts[position].profession
//    }
//
//    override fun getItemCount(): Int {
//        return contacts.size
//    }
//
//    inner class ViewHolder(contactView: View): RecyclerView.ViewHolder(contactView) {
//        var contactImage: ImageView = contactView.findViewById(R.id.contact_photo)
//        var contactName: TextView = contactView.findViewById(R.id.contact_name)
//        var contactProfession: TextView = contactView.findViewById(R.id.contact_profession)
//
//    }
//}
package com.example.applesson2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppViewModel: ViewModel() {
    val contactsList: MutableLiveData<List<Contact>> by lazy {
        MutableLiveData<List<Contact>>().also { loadUsers() }
    }

    fun getContacts() = contactsList

    fun loadUsers() {}


}
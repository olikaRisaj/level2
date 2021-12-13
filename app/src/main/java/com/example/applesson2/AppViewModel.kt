package com.example.applesson2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppViewModel: ViewModel() {
    val contactsList: MutableLiveData<List<Contact>> = MutableLiveData()

    init {
        if(contactsList.value == null) {
            contactsList.value = loadUsers()
        }
    }


    fun loadUsers(): List<Contact> {
        return listOf(Contact("https://adobe.ly/3rdh0Hw", "Contact 1", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 2", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 3", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 4", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 5", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 6", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 7", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 8", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 9", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 10", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 11", "profession"), )
    }
}
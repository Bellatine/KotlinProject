package com.namng.phonedirectory.Object

class ObjectModel(val ID: Int, val name: String, val email: String, val phoneNumber: String, val imageThumb: Int) {
    var selected: Boolean = false;

    fun LogObject(): String{
        return "ID: $ID, Name: $name, Email: $email, PhoneNumber: $phoneNumber"
    }
}
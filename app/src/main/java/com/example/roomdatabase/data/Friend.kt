package com.example.roomdatabase.data

import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity
//data class Friend(
//    val name: String,
//    val school: String,
//    val hobby: String
//) {
//    @PrimaryKey(autoGenerate = true)
//    var id: Int = 0
//}
data class Friend(
    var name: String,
    var school: String,
    var hobby: String,
    var phone: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
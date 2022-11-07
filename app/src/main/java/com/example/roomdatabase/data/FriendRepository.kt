package com.example.roomdatabase.data

import androidx.lifecycle.LiveData
import com.example.roomdatabase.data.Friend
import com.example.roomdatabase.data.FriendDao

class FriendRepository (private val friendDao: FriendDao) {
    fun getAll(): LiveData<List<Friend>>{
        return friendDao.getAll()
    }
}

package com.example.roomdatabase.data

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Dao
import com.crocodic.core.data.CoreDao

import androidx.room.Query


//@Dao
//interface FriendDao {
   // @Insert
   // fun insert(friend: Friend)

    //@Query("SELECT * FROM Friend")
    //fun getAll(): LiveData<List<Friend>>

   // @Update
   // fun update(friend: Friend)

   // @Delete
  //  fun delete(friend: Friend)
//}

@Dao
abstract class FriendDao :
//    @Query("SELECT * FROM Friend")
//    abstract fun getAll():LiveData<List<Friend>>
}


package com.example.roomdatabase.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil
import com.example.roomdatabase.R
import com.example.roomdatabase.data.FriendRepository
import com.example.roomdatabase.data.MyDatabase
import com.example.roomdatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var myDatabase: MyDatabase
    private lateinit var repository: FriendRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this
        myDatabase = MyDatabase.getDatabase(this)
        repository = FriendRepository(myDatabase.friendDao())

        //myDatabase.friendDao().getAll().observe(this, {
          // Toast.makeText(this, "Ada data baru ${it.size}", Toast.LENGTH_SHORT).show()
        //})

    repository.getAll().observe(this, {
        Toast.makeText(this, "Ada data baru ${it.size}", Toast.LENGTH_SHORT).show()
    })

    }

    fun addFriend() {
        startActivity(Intent(this, AddFriendActivity::class.java))
    }
}
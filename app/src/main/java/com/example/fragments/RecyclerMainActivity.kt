package com.example.fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import recyclerView.User
import recyclerView.UserAdapter

class RecyclerMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


        val users = listOf(
            User("Ashok", 22),
            User("Ravi", 25),
            User("Suresh", 28),
            User("Ramesh", 28),
            User("Bhanu", 28),
            User("Chandu", 22),
            User("Akash", 22),
            User("Jai", 22),
            User("Danush", 22),
            User("Kavitha", 22),
            User("Sirisha", 22),
            User("Madhavi", 22),
            User("Kalavathi", 22),
            User("Padmini", 22),
            User("Moksha", 22),
            User("pavani", 22),
            User("chandrika", 22),
            User("Harika", 22),
            User("Lavanya", 22)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserAdapter(users)
    }
}
package com.example.zodiaclistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zodiaclistapp.data.SignDataSource
import com.example.zodiaclistapp.databinding.ActivityMainBinding
import com.example.zodiaclistapp.model.Sign

class MainActivity : AppCompatActivity() {

    private lateinit var signAdapter: SignAdapter
    private lateinit var recyclerview:RecyclerView
    private lateinit var signList:ArrayList<Sign>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signList = ArrayList()

        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerview = findViewById(R.id.recyclerview)
        signAdapter = SignAdapter(this, signList)

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = signAdapter


        //signAdapter.setList(SignDataSource.createDataset())
        SignDataSource.createDataset().forEach{
            signList.add(it)
        }
        signAdapter.notifyDataSetChanged()
    }
}
package com.example.recyclerandpaging

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerandpaging.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var newRecyclerView: RecyclerView
    private var nameList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        nameList.add("hey")
        nameList.add("hello")
        nameList.add("there")

        newRecyclerView = binding.recyclerViewMain
        newRecyclerView.adapter = RecyclerAdapter(nameList)
    }
}
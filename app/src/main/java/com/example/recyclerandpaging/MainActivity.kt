package com.example.recyclerandpaging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerandpaging.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var newRecyclerView : RecyclerView
    private  var nameList : ArrayList<String> = ArrayList()
    private  var phoneList : ArrayList<String> = ArrayList()
    private  var emailList : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        nameList.add("hey")
        nameList.add("hello")
        nameList.add("there")

        phoneList.add("9876543210")
        phoneList.add("9786543212")
        phoneList.add("9786543234")

        emailList.add("hey@gmial.com")
        emailList.add("hello@gmail.com")
        emailList.add("there@gmail.com")

        newRecyclerView= binding.recyclerViewMain
        newRecyclerView.adapter = RecyclerAdapter(nameList,phoneList,emailList)



    }


}
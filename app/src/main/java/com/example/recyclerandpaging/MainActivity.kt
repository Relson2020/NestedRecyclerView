package com.example.recyclerandpaging

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.recyclerandpaging.adapter.BaseItemClickListener
import com.example.recyclerandpaging.databinding.ActivityMainBinding
import com.example.recyclerandpaging.view.ChildViewModel
import com.example.recyclerandpaging.view.ParentViewModel
import com.example.recyclerandpaging.adapter.BaseCommonAdapter
import com.example.recyclerandpaging.adapter.BaseViewModel

class MainActivity : AppCompatActivity() , BaseItemClickListener{
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: BaseCommonAdapter<ParentViewModel>
    private lateinit var childAdapter : BaseCommonAdapter<ChildViewModel>
    private var adapterList: MutableList<ParentViewModel> = arrayListOf()
    private var childAdapterList: MutableList<ChildViewModel> = arrayListOf()
    private var nameList: ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        childAdapterList.add(ChildViewModel("hello"))
        childAdapterList.add(ChildViewModel("there"))
        childAdapterList.add(ChildViewModel("welcome"))
        childAdapterList.add(ChildViewModel("you"))


        childAdapter = BaseCommonAdapter(childAdapterList,this)

        adapterList.add(ParentViewModel(childAdapter))
        adapterList.add(ParentViewModel( childAdapter))
        adapterList.add(ParentViewModel( childAdapter))
        adapterList.add(ParentViewModel( childAdapter))

        adapter = BaseCommonAdapter(adapterList,this)

        binding.recyclerViewMain.adapter = adapter
    }

    override fun onItemClick(view: View, value: BaseViewModel) {

    }
}
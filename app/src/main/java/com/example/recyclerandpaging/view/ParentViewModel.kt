package com.example.recyclerandpaging.view

import android.util.Log
import com.example.recyclerandpaging.R
import com.example.recyclerandpaging.adapter.BaseCommonAdapter
import com.example.recyclerandpaging.adapter.BaseViewModel

class ParentViewModel (val adapter : BaseCommonAdapter<ChildViewModel>) : BaseViewModel() {

    init {
        Log.i("adapter",adapter.toString())
    }

    /**
     * @return Layout file i.e R.layout.view_design
     */
    override val viewType: Int = R.layout.recycler_item_view

}
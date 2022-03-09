package com.example.recyclerandpaging.view

import com.example.recyclerandpaging.R
import com.example.recyclerandpaging.adapter.BaseViewModel

class ChildViewModel(val name: String) : BaseViewModel() {

    /**
     * @return Layout file i.e R.layout.view_design
     */
    override val viewType: Int = R.layout.child_layout

}
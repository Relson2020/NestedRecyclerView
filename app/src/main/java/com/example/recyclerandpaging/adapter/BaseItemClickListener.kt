package com.example.recyclerandpaging.adapter;

import android.view.View

interface BaseItemClickListener {
    fun onItemClick(view: View, value: BaseViewModel)
}
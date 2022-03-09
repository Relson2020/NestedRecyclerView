package com.example.recyclerandpaging.adapter

import android.view.View
import com.example.recyclerandpaging.adapter.BaseItemClickListener


abstract class BaseViewModel {

    var clickListener: BaseItemClickListener? = null

    open fun onItemClick(view: View) {
        clickListener?.onItemClick(
            view, this
        )
    }

    /**
     * @return Layout file i.e R.layout.view_design
     */
    abstract val viewType: Int
}
package com.example.gittestdemo

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.gittestdemo.databinding.TitleBinding

class TitleLayout(context: Context,attr:AttributeSet) : ConstraintLayout(context,attr) {

    private lateinit var mBinding: TitleBinding

    init {
        //动态加载布局
        LayoutInflater.from(context).inflate(R.layout.title, this)
        mBinding = TitleBinding.bind(this)


        mBinding.titleBackButton.setOnClickListener {
            val a = context as Activity
            a.finish()
        }
    }
}
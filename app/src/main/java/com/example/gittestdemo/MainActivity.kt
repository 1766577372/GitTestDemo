package com.example.gittestdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gittestdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnAdd1.setOnClickListener {
            num++
            mBinding.textnumber.text = num.toString()
        }

    }
}
package com.example.gittestdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gittestdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private var num = 0
    private var KEY_numA = "KEY_numA"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        num = getSharedPreferences("data", Context.MODE_PRIVATE).getInt(KEY_numA, 0)
        mBinding.textnumber.text = num.toString()
        mBinding.btnAdd1.setOnClickListener {
            num++
            mBinding.textnumber.text = num.toString()
        }

    }

    fun Save() =
        getSharedPreferences("data", Context.MODE_PRIVATE).edit().apply {
            putInt(KEY_numA, num)
        }.apply()


}
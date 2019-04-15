package com.yuramax.buglydemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            if (cb.isChecked){
                cb.isChecked = false
                Toast.makeText(this@MainActivity,"取消选中",Toast.LENGTH_SHORT).show()
            }else{
                cb.isChecked = true
                Toast.makeText(this@MainActivity,"选中",Toast.LENGTH_SHORT).show()
            }
        }
    }
}

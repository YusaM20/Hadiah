package com.example.tugas.RecycleView

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas.R



class AddActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<item>
    lateinit var titleimage : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)


        titleimage = arrayOf(
            R.drawable.wifu1,
            R.drawable.wifu2,
            R.drawable.wifu3,
            R.drawable.wifu4,
            R.drawable.aqua,
            R.drawable.megumi,
        )


        newRecyclerView = findViewById(R.id.rcycle)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)


        newArrayList = arrayListOf<item>()
        getUserData()


    }

    private fun getUserData() {

        for(i in titleimage.indices){
            val item = item(titleimage[i])
            newArrayList.add(item)
        }

        newRecyclerView.adapter = adapter(newArrayList)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }


}
package com.example.tugas.TabLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tugas.R
import com.google.android.material.tabs.TabLayout

class TabActivity : AppCompatActivity() {

    private lateinit var tablayout : TabLayout
    private lateinit var viewpages2 : ViewPager2
    private lateinit var adapter: FragmentPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        tablayout = findViewById(R.id.tb_layout)
        viewpages2 = findViewById(R.id.vpage)


        adapter = FragmentPageAdapter(supportFragmentManager, lifecycle)

        tablayout.addTab(tablayout.newTab().setText("first"))
        tablayout.addTab(tablayout.newTab().setText("Second"))

        viewpages2.adapter = adapter

        tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewpages2.currentItem = tab.position
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        viewpages2.registerOnPageChangeCallback(object  : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tablayout.selectTab(tablayout.getTabAt(position))
            }
        })

    }
}
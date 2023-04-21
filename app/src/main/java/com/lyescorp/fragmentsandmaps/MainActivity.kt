package com.lyescorp.fragmentsandmaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.material.tabs.TabLayout
import com.lyescorp.fragmentsandmaps.adapters.ViewPagerAdapter
import com.lyescorp.fragmentsandmaps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var pagerAdapter: ViewPagerAdapter
    private var stackablePoints = true;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        pagerAdapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = pagerAdapter
        supportActionBar!!.setTitle(R.string.main_ac)
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.viewPager!!.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

    }



}
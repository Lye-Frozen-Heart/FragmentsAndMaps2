package com.lyescorp.fragmentsandmaps.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lyescorp.fragmentsandmaps.MapsFragment
import com.lyescorp.fragmentsandmaps.PointingFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    val fragmentlist:MutableList<Fragment> = mutableListOf()
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int):Fragment {
        var fragment:Fragment = when(position){
            0 -> PointingFragment()
            1 -> MapsFragment()
            2 -> PointingFragment()
            else -> PointingFragment()
        }
        fragmentlist.add(fragment)
        return fragment
    }


}
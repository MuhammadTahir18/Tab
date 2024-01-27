package com.firstproject.tab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.firstproject.tab.fragements.FollowingFragment
import com.firstproject.tab.fragements.ForyouFragment
import com.firstproject.tab.fragements.locationFragment

class viewPageAdapter (frag: FragmentActivity, private var totalCount: Int) : FragmentStateAdapter(frag) {

        override fun getItemCount(): Int {
            return totalCount
        }

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0->locationFragment()
                1 -> ForyouFragment()
               2->FollowingFragment()

                else -> locationFragment()

}
        }
}
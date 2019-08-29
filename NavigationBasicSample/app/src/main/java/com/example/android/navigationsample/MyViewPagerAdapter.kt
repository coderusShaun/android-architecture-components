package com.example.android.navigationsample

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * A FragmentPagerAdapter loading arbitrary fragments into view.
 */
class MyViewPagerAdapter(
        fm: FragmentManager,
        private val items: List<String>
) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount() = items.size

    override fun getItem(position: Int) = MyFragment.newInstance(items[position])

    override fun getItemId(position: Int): Long = items[position].hashCode().toLong()
}

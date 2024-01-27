package com.firstproject.tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firstproject.tab.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupViewPager()
        setupTabLayout()
    }



    private fun setupTabLayout() {
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            if(position==0) tab.text ="Location"
            else if(position==1) tab.text="For You"
            else if(position==2) tab.text="Following"
        }.attach()
    }
    private fun setupViewPager() {
        val adapter = viewPageAdapter(this@MainActivity, 3)
        binding.viewPager.adapter =adapter


}}




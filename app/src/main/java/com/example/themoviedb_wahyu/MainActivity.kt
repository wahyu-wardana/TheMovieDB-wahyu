package com.example.themoviedb_wahyu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.themoviedb_wahyu.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPageAdapter: ViewPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewPageAdapter = ViewPageAdapter(supportFragmentManager, lifecycle)

        with(binding){
            viewPageAdapter = viewPageAdapter

            TabLayoutMediator(tabLayout, viewPager) {tab, position ->
                when(position){
                    0 -> tab.text = "Movie"
                    1 -> tab.text = "Television"
                }
            }.attach()
        }
    }
}
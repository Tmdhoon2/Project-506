package com.tmdhoon.new506project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tmdhoon.new506project.databinding.ActivityMainBinding
import okhttp3.internal.notify

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var homeFragment: HomeFragment
    private lateinit var toiletFragment: ToiletFragment
    private lateinit var bedFragment: BedFragment
    private lateinit var postFragment: PostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomnav.setOnNavigationItemSelectedListener(onBottomNavigationSelectedListener)
    }

    override fun onResume() {
        super.onResume()
        supportFragmentManager.beginTransaction().replace(R.id.FrameLayout, HomeFragment())
            .commit()
    }
    private val onBottomNavigationSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId){
            R.id.menu_home -> {
                homeFragment = HomeFragment.newInstance()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.FrameLayout, homeFragment).commit()
            }
            R.id.menu_toilet -> {
                toiletFragment = ToiletFragment.newInstance()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.FrameLayout, toiletFragment).commit()
            }
            R.id.menu_bed -> {
                bedFragment = BedFragment.newInstance()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.FrameLayout, bedFragment).commit()
            }
            R.id.menu_post -> {
                postFragment = PostFragment.newInstance()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.FrameLayout, postFragment).commit()
            }
        }
        true
    }
}
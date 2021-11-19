package com.nim19041156.flexiblefragmentapp5h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Mendeklarasikan Fragment yang akan dipakai

        val homeFragment = HomeFragment()
        // Menambahkan Support Manager
        val fragment : Fragment? = supportFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if (fragment !is HomeFragment) {
            // membuat transaction
            supportFragmentManager.beginTransaction()
                .add(R.id.container, homeFragment, HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}
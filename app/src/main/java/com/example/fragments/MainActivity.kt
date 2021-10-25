package com.example.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.Static_Fragment.Static_Activity
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = First_Fragment()
        val secondFragment = Second_Fragment()

        binding.fragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Place_holder,firstFragment)
                commit()
            }
        }
        binding.fragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Place_holder,secondFragment)
                commit()
            }
        }
        binding.btnStatic.setOnClickListener {
            val intent = Intent(this,Static_Activity::class.java)
            startActivity(intent)
        }
    }
}
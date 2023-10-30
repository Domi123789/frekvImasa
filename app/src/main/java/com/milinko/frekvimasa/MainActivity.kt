package com.milinko.frekvimasa

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.milinko.frekvimasa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frekv.setOnClickListener{
        Intent(this, frekviiperiod::class.java).also{ startActivity(it) }
        }
        binding.masa.setOnClickListener{
            Intent(this, MasaTvari::class.java).also{ startActivity(it) }
        }
    }
}
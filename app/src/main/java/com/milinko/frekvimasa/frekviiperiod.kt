package com.milinko.frekvimasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.milinko.frekvimasa.databinding.ActivityFrekviiperiodBinding
import com.milinko.frekvimasa.databinding.ActivityMainBinding

class frekviiperiod : AppCompatActivity() {
    lateinit var binding: ActivityFrekviiperiodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrekviiperiodBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buton.setOnClickListener{
            val f = binding.frekvencija.text.toString().toFloatOrNull()
            if (f != null && f != 0.0f) {
                val T = 1 / f
                binding.period.text = T.toString()
            }
            else
            {
                binding.period.text = "Unesite valjan broj koji nije nula"
            }
        }
    }
}
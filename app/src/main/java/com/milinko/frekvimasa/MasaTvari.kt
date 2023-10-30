package com.milinko.frekvimasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.milinko.frekvimasa.databinding.ActivityMasaTvariBinding

class MasaTvari : AppCompatActivity() {
    lateinit var binding: ActivityMasaTvariBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasaTvariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.racun.setOnClickListener{
            val duzina = binding.duzina.text.toString().toFloatOrNull()
            val sirina = binding.sirina.text.toString().toFloatOrNull()
            val visina = binding.visina.text.toString().toFloatOrNull()
            val gustoca = binding.gustoca.text.toString().toFloatOrNull()

            if (duzina != null && sirina != null && visina != null && gustoca != null) {
                val volumen = duzina * sirina * visina
                val masa = gustoca * volumen
                binding.rjesenje.text = masa.toString()
            }
            else {
                    binding.rjesenje.text = "Unesite valjane brojeve u sva polja"
                 }
        }
    }
}
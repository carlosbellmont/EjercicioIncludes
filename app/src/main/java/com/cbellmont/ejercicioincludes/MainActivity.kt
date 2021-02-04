package com.cbellmont.ejercicioincludes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cbellmont.ejercicioincludes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.item1.tvNombre.text = "NombreRisas"
        binding.item1.tvEmail.text = "jajaj@jajaj.com"
        binding.item1.layoutPrincipal.setOnClickListener {
            Toast.makeText(this, "Soy ${binding.item1.tvNombre.text}", Toast.LENGTH_LONG).show()
        }

        binding.item2.tvNombre.text = "Este otro personaje"
        binding.item2.tvEmail.text = "email@email.com"
    }
}
package me.dio.simulator_android_native

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dio.simulator_android_native.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
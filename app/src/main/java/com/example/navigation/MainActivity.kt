package com.example.navigation

import android.os.Bundle
import android.view.Menu
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val appBarConfiguration by lazy {
        AppBarConfiguration(setOf(
            R.id.home,
            R.id.settings
        ))
    }
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val navController by lazy {
        findNavController(R.id.navHostFragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
println("########################begin")
        setContentView(binding.root)
        println("########################setContentView(binding.root)")
        //setupActionBarWithNavController(navController, appBarConfiguration)
        println("########################setupActionBarWithNavController(navController, appBarConfiguration)")
        binding.navigationView.setupWithNavController(navController)
        println("########################binding.navigationView.setupWithNavController(navController)")

        binding.navigationView.getOrCreateBadge(R.id.home).apply {
            backgroundColor = ContextCompat.getColor(this@MainActivity, R.color.purple_200)
        }
        println("########################binding.navigationView")
    }
}
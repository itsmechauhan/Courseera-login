package com.example.coursera

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.replace
import com.example.coursera.databinding.ActivityMainBinding
import java.util.Timer
import kotlin.concurrent.schedule
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask

val Frontpagefragment =frontpage()
val loginpagefragment= loginpage()
val emailLoginfragment=email_login()


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    fun fragmentloader(K:Fragment,f:Int){
        val fm: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction =fm.beginTransaction()
        if(f==0)ft.add(R.id.container,K)
        else ft.replace(R.id.container,K)
        ft.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentloader(Frontpagefragment,0)



        Handler(Looper.getMainLooper()).postDelayed({
            fragmentloader(loginpagefragment,1)
        },5000)






    }}
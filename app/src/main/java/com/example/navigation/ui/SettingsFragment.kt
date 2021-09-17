package com.example.bottomnavigationexample.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
//import com.example.bottomnavigationexample.R
import com.example.navigation.R
import androidx.fragment.app.Fragment as Fragment1

class SettingsFragment: Fragment1(R.layout.fragment_settings){
    init{
        println("######################get SettingsFragment")

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val sw =inflater.inflate(R.layout.fragment_settings, container, false)
        val swit1 = sw.findViewById<Switch>(R.id.switch1)
        swit1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                println("##########Standard Switch is on")
                //val fs=sw.findViewById<Fragment>(R.id.fset)
            }else{
                println("#############Standard Switch is off")
            }
        }
        return sw
    }
}
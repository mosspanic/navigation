package com.example.bottomnavigationexample.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
//import com.example.bottomnavigationexample.R
import com.example.navigation.R
import androidx.fragment.app.Fragment as Fragment1
import androidx.fragment.app.Fragment as Fragment2

class SettingsFragment: Fragment2(R.layout.fragment_settings){
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
                val fs=sw.findViewById<View>(R.id.fset)
                val txt="тёмная тема"
                val duration= Toast.LENGTH_SHORT
                val toast=Toast.makeText(activity,txt,duration)
                toast.show()
                fs.setBackgroundColor(0xFFFFFF)
                fs.invalidate()
            }else{
                println("#############Standard Switch is off")
                val fs=sw.findViewById<View>(R.id.fset)
                val txt="светлая тема"
                val duration= Toast.LENGTH_SHORT
                val toast=Toast.makeText(activity,txt,duration)
                toast.show()
                fs.setBackgroundColor(0x0000FF00)
                fs.invalidate()
            }
        }
        return sw
    }
}
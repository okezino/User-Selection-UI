package com.example.jos_week_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    /**
     * default setting of the toggle is set to 1 for Day mode and can be switch to zero for Dark mode
     * companion object is use to get a static instance of the variable
     */
    companion object{
        var toggleSettings = 1
    }

    /**
     * Declaration of the Image_view that calls the toggleMode Function
     */
    lateinit var ImageNight : ImageView
    lateinit var ImageDay : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ImageNight = findViewById(R.id.imageViewNight)
        ImageDay = findViewById(R.id.imageViewDay)

        // this check for the current state of the Mode and set the Toggle vector that calls the mode accordingly
        if(toggleSettings == 0) {
            ImageNight.isVisible = true
            ImageDay.isVisible = false
        }


    }

    /**
     * Toggle Function to set the MODE from NIGHT TO DAY
     * Change visibility of the Clickable Vector to different mode using alternating 1 and 0
     * 1 for DayMode
     * 0 for NightMode
     */

    fun toggleMode(view: View){
        if(toggleSettings == 1) {
            ImageDay.isVisible = false
            ImageNight.isVisible = true
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            toggleSettings = 0

        }else {

            ImageDay.isVisible = true
            ImageNight.isVisible = false
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            toggleSettings = 1
        }
    }



}
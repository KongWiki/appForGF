package com.example.weikunkun.welcome

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_monochrome.*
import ru.github.igla.ferriswheel.CoreStyle


/**
 * author: kongwiki
 * date: on 18-12-29
 * email: kongwiki@163.com
 */

class SampleKotlinActivityMonochrome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_monochrome)
        ferrisWheelView.apply {
            coreStyle = CoreStyle(Color.WHITE, Color.WHITE)
        }
    }
}
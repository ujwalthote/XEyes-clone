package com.coderfolk.xeyesclone

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var vgRootContainer: RelativeLayout? = null
    private var vgContainerEye: RelativeLayout? = null
    private var viewEyeBall: View? = null
    private var xOfEyeContainer: Float? = null
    private var yOfEyeContainer: Float? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        vgRootContainer = findViewById(R.id.vgRootContainer)
        vgContainerEye = findViewById(R.id.vgContainerEye)
        viewEyeBall = findViewById(R.id.viewEyeBall)
        keepTheCenterOfVgEyeContainer()
        setUpListener()
    }

    private fun keepTheCenterOfVgEyeContainer() {
        xOfEyeContainer = vgContainerEye?.pivotX
        yOfEyeContainer = vgContainerEye?.pivotY
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setUpListener() {
        vgRootContainer?.setOnTouchListener { v, event ->

            return@setOnTouchListener v?.onTouchEvent(event) ?: true
        }
    }

}




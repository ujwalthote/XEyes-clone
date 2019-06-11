package com.coderfolk.xeyesclone

import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var vgRootContainer: RelativeLayout? = null
    private var vgContainerEye: RelativeLayout? = null
    private var viewEyeBall: View? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        vgRootContainer = findViewById(R.id.vgRootContainer)
        vgContainerEye = findViewById(R.id.vgContainerEye)
        viewEyeBall = findViewById(R.id.viewEyeBall)
    }
}



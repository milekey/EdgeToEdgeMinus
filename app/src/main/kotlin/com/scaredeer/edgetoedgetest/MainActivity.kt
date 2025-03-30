package com.scaredeer.edgetoedgetest

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.scaredeer.edgetoedge.enableEdgeToEdge
import com.scaredeer.edgetoedge.isEnabled
import com.scaredeer.edgetoedge.revertEdgeToEdge

class MainActivity : AppCompatActivity() {

    private lateinit var button: View

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            if (isEnabled) {
                revertEdgeToEdge()
            } else {
                enableEdgeToEdge()
            }
        }
    }

    override fun onDestroy() {
        button.setOnClickListener(null)
        super.onDestroy()
    }
}
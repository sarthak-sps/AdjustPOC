package com.example.adjustpoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.adjust.sdk.Adjust
import com.adjust.sdk.AdjustEvent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button.setOnClickListener {
            val username = "Data"
            val event = AdjustEvent("aq9soi")
            event.addCallbackParameter("Demo_1", username)
            Adjust.trackEvent(event)
        }

        button2.setOnClickListener {

        }

        button3.setOnClickListener {

        }


    }

    override fun onResume() {
        super.onResume()
        Adjust.onResume()
    }

    override fun onPause() {
        super.onPause()
        Adjust.onPause()
    }

}
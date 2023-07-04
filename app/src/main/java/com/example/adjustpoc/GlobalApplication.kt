package com.example.adjustpoc

import android.app.Application
import com.adjust.sdk.Adjust
import com.adjust.sdk.AdjustConfig
import com.adjust.sdk.LogLevel

class GlobalApplication : Application() {

    override fun onCreate() {

        super.onCreate()
        val appToken: String = "ee9elmbzgcu8"
        val config: AdjustConfig = AdjustConfig(this, appToken, AdjustConfig.ENVIRONMENT_PRODUCTION)
        config.setLogLevel(LogLevel.VERBOSE)
        Adjust.onCreate(config)
        Adjust.onResume()
    }

}
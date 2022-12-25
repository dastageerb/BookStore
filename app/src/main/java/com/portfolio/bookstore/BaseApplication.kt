package com.portfolio.bookstore

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCenter.start(this, BuildConfig.AppCenterSecretKey, Analytics::class.java, Crashes::class.java)
    }
}
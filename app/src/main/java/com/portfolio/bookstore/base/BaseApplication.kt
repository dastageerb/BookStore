package com.portfolio.bookstore.base

import android.app.Application
import com.portfolio.bookstore.BuildConfig
import timber.log.Timber

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
package com.example.delllatitude5490.projet_tdm

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        context = this
    }

    companion object {

        @SuppressLint("StaticFieldLeak")
        var context: Context? = null
            private set
    }
}
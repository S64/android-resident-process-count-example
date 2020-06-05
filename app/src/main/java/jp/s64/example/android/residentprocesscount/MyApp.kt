package jp.s64.example.android.residentprocesscount

import android.app.Application
import android.content.Intent

class MyApp : Application() {

    var count = 0

    override fun onCreate() {
        super.onCreate()
        startForegroundService(Intent(this, MyService::class.java))
    }

}

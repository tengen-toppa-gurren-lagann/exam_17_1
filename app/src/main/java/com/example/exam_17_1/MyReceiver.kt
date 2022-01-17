package com.example.exam_17_1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import android.util.Log

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
        Log.d("MyReceiver", "Battery level = $level")
    }
}
package com.example.baitapbroadcastairplane

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastAirPlane: BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val isAirPlaneModel: Boolean = p1!!.getBooleanExtra("state",false)
        if (isAirPlaneModel){
            Toast.makeText(p0,"Chế độ máy bay đang bật",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(p0,"Chế độ máy bay đang tắt",Toast.LENGTH_SHORT).show()
        }
    }
}
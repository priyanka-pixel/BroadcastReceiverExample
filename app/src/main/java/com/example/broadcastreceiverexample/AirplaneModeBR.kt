package com.example.broadcastreceiverexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeBR: BroadcastReceiver() {
    /**
     * this function is executed when user change the airplane mode
     *
     */
    override fun onReceive(p0: Context?, p1: Intent?) {

        val isAirPlaneModeEnabled = p1?.getBooleanExtra("state", false) ?: return

        if(isAirPlaneModeEnabled){
            Toast.makeText(p0, "Airplane is enabled", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(p0, "Airplane is disabled", Toast.LENGTH_LONG).show()

        }
    }
}
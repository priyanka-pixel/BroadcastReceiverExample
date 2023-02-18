package com.example.broadcastreceiverexample

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var  receiver: AirplaneModeBR

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        receiver = AirplaneModeBR()
        /**
         * IntentFilter is useful to determine which apps wants to receive which intents
         */

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also{
            registerReceiver(receiver,it)
            //1 Register the broadcastreceiver(BR)
            //2 it paramteter which is passed in reisterReceiver()

        }
        /**
         * let
         * with
         * also
         * run
         * apply
         */

    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}
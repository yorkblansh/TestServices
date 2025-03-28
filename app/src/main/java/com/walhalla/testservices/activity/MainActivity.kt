package com.walhalla.testservices.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.walhalla.testservices.Constants
import com.walhalla.testservices.MediaPlayerService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val intent = Intent(this@MainActivity, MediaPlayerService::class.java)
        intent.setAction(Constants.ACTION.STARTFOREGROUND_ACTION)
        startService(intent)
    }
}
package com.curso.android.musicplayer

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

class MyCustomService : Service() {
    private lateinit var mediaPlayer : MediaPlayer


    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)

        mediaPlayer.isLooping = true
        mediaPlayer.start()

        return START_STICKY
    }

    override fun onDestroy() {
        mediaPlayer.stop()
    }

    override fun onBind(intent: Intent): IBinder {
        return null!!
    }
}
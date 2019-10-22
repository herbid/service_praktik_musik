package com.example.servicepraktik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //button
        btn_facebook.setOnClickListener({val i =Intent(Intent.ACTION_VIEW,
            Uri.parse("http://www.facebook.com/sampah"))
            startActivity(i)
        })
        btn_facebook.setOnClickListener({val i =Intent(Intent.ACTION_VIEW,
            Uri.parse("http://www.instagram.com/sampah"))
            startActivity(i)
        })

        //mp3
        var MediaPlayer: MediaPlayer?=MediaPlayer.create(this,R.raw.apenjed)
        //button
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        //button
        btn_pause.setOnClickListener {
            MediaPlayer?.pause()
        }
       //button
        btn_stop.setOnClickListener {
            MediaPlayer?.stop()
            MediaPlayer?.seekTo(0)

        }

    }
}

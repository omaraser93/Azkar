package com.omar.azkar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AzkarActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer1 ;
    MediaPlayer mediaPlayer2 ;
    MediaPlayer mediaPlayer3 ;
    TextView textView1 ;
    TextView textView2 ;
    TextView textView3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);

        mediaPlayer1 = MediaPlayer.create(this,R.raw.mp01);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.mp02);
        mediaPlayer3 = MediaPlayer.create(this,R.raw.mp03);

        textView1 = findViewById(R.id.t1);
        textView2 = findViewById(R.id.t2);
        textView3 = findViewById(R.id.t3);
    }

    public void start1(View view) {
        mediaPlayer1.start();
    }

    public void stop1(View view) {
        mediaPlayer1.pause();
    }


    public void Increase1(View view) {
        textView1.setTextSize(40);
    }

    public void decrease1(View view) {
        textView1.setTextSize(15);
    }

    public void start2(View view) {
        mediaPlayer2.start();
    }

    public void stop2(View view) {
        mediaPlayer2.pause();
    }

    public void Increase2(View view) {
        textView2.setTextSize(40);
    }

    public void decrease2(View view) {
        textView2.setTextSize(15);
    }

    public void start3(View view) {
        mediaPlayer3.start();
    }

    public void stop3(View view) {
        mediaPlayer3.pause();
    }

    public void Increase3(View view) {
        textView3.setTextSize(40);
    }

    public void decrease3(View view) {
        textView3.setTextSize(15);
    }
}

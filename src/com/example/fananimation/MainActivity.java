package com.example.fananimation;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView fanImage;

    private Button btnOn;
    private Button btnOff;
    private Button btnSlow;
    private Button btnMedium;
    private Button btnFast;

    private ObjectAnimator fanAnimator;
    private MediaPlayer mediaPlayer;

    private static final long SPEED_SLOW = 1000;
    private static final long SPEED_MEDIUM = 500;
    private static final long SPEED_FAST = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fanImage = (ImageView) findViewById(R.id.fanImage);

        btnOn = (Button) findViewById(R.id.btnOn);
        btnOff = (Button) findViewById(R.id.btnOff);
        btnSlow = (Button) findViewById(R.id.btnSlow);
        btnMedium = (Button) findViewById(R.id.btnMedium);
        btnFast = (Button) findViewById(R.id.btnFast);

    createAnimator();

        btnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFanSpeed(SPEED_SLOW, R.raw.fan_slow);
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopFan();
            }
        });

        btnSlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFanSpeed(SPEED_SLOW, R.raw.fan_slow);
            }
        });

        btnMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFanSpeed(SPEED_MEDIUM, R.raw.fan_medium);
            }
        });

        btnFast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFanSpeed(SPEED_FAST, R.raw.fan_fast);
            }
        });
    }

    private void createAnimator() {

        fanAnimator = ObjectAnimator.ofFloat(
                fanImage,
                "rotation",
                0f,
                360f);

        fanAnimator.setInterpolator(new LinearInterpolator());
        fanAnimator.setRepeatCount(ValueAnimator.INFINITE);
        fanAnimator.setRepeatMode(ValueAnimator.RESTART);
    }

    private void setFanSpeed(long duration, int soundRes) {

        if (fanAnimator.isRunning()) {
            fanAnimator.cancel();
        }

        fanAnimator.setDuration(duration);
        fanAnimator.start();

        playSound(soundRes);
    }

    private void playSound(int soundRes) {

        stopSound();

        mediaPlayer = MediaPlayer.create(this, soundRes);

        if (mediaPlayer != null) {
            mediaPlayer.setLooping(true);
            mediaPlayer.start();
        }
    }

    private void stopFan() {

        if (fanAnimator != null && fanAnimator.isRunning()) {
            fanAnimator.cancel();
        }

        fanImage.setRotation(0f);

        stopSound();
    }

    private void stopSound() {

        if (mediaPlayer != null) {

            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }

            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onDestroy() {

        stopSound();

        if (fanAnimator != null) {
            fanAnimator.cancel();
        }

        super.onDestroy();
    }
}

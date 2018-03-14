package com.gconnect.npower.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.gconnect.npower.R;

public class MainActivity extends AppCompatActivity {
//    private InterstitialAd mInterstitialAd;
    private static int SPLASH_TIME_OUT = 2000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());*/

        new Handler().postDelayed(new Runnable() {
            public void run() {
           MainActivity.this.startActivity(new Intent(MainActivity.this, HomeActivity.class));
             MainActivity.this.finish();
               /* if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                    mInterstitialAd.setAdListener(new AdListener() {
                        @Override
                        public void onAdClosed() {
                            // Create an Intent that will start the main activity.
                            Intent mainIntent = new Intent(MainActivity.this, HomeActivity.class);
                            MainActivity.this.startActivity(mainIntent);*/

                        }
                    }, (long) SPLASH_TIME_OUT);
                }
    }


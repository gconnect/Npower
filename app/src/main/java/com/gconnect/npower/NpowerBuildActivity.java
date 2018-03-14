package com.gconnect.npower;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.NativeExpressAdView;
import com.google.android.gms.ads.VideoController;

public class NpowerBuildActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private static String LOG_TAG = "EXAMPLE";

    NativeExpressAdView mAdView;
    VideoController mVideoController;
    //question1
    RadioButton bquestion1_option1;
    RadioButton bquestion1_option2;

    //question2
    RadioButton bquestion2_option1;
    RadioButton bquestion2_option2;

    //question3
    RadioButton bquestion3_option1;
    RadioButton bquestion3_option2;
    RadioButton bquestion3_option3;
    RadioButton bquestion3_option4;

    //question4
    RadioButton bquestion4_option1;
    RadioButton bquestion4_option2;
    RadioButton bquestion4_option3;
    RadioButton bquestion4_option4;
    RadioButton bquestion4_option5;
    RadioButton bquestion4_option6;
    RadioButton bquestion4_option7;

    //question5
    RadioButton bquestion5_option1;
    RadioButton bquestion5_option2;


    int answer1_score;
    int answer2_score;
    int answer3_score;
    int answer4_score;
    int answer5_score;
    int final_score;
    Button buildSubmit;

    private AdView mAdview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_npower_build);

        MobileAds.initialize(getApplicationContext(),"ca-app-pub-2157637459533575~9189702048");

        mAdview =(AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);



        Button next = (Button) findViewById(R.id.buildSubmit);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());





        buildSubmit = (Button) findViewById(R.id.buildSubmit);
        buildSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    CharSequence resultsDisplay;


                    // Question a - Any option is correct
       Boolean answer1;
                Boolean answer1b;
        bquestion1_option1 = (RadioButton) findViewById(R.id.bquestion1_option1);
        answer1 = bquestion1_option1.isChecked();
                bquestion1_option2 = (RadioButton) findViewById(R.id.bquestion1_option2);
                answer1b = bquestion1_option2.isChecked();

        if (answer1) {
            answer1_score = 1;
        }else if (answer1b){
            answer1_score = 1;
        } else{
                    answer1_score = 0;
                }

                // Question b - Any option is correct
                Boolean answer2;
                Boolean answer2b;
                bquestion2_option1 = (RadioButton) findViewById(R.id.bquestion2_option1);
                answer2 = bquestion2_option1.isChecked();
                bquestion2_option2 = (RadioButton) findViewById(R.id.bquestion2_option2);
                answer2b = bquestion2_option2.isChecked();

                if (answer2) {
                    answer2_score = 1;
                }else if (answer2b){
                    answer2_score = 1;
                } else{
                    answer2_score = 0;
                }

                // Question c - Any option is correct
                Boolean answer3;
                Boolean answer3b;
                Boolean answer3c;
                Boolean answer3d;
                bquestion3_option1 = (RadioButton) findViewById(R.id.bquestion3_option1);
                answer3 = bquestion3_option1.isChecked();
                bquestion3_option2 = (RadioButton) findViewById(R.id.bquestion3_option2);
                answer3b = bquestion3_option2.isChecked();
                bquestion3_option3 = (RadioButton) findViewById(R.id.bquestion3_option3);
                answer3c = bquestion3_option3.isChecked();
                bquestion3_option4 = (RadioButton) findViewById(R.id.bquestion3_option4);
                answer3d = bquestion3_option4.isChecked();

                if (answer3) {
                    answer3_score = 1;
                }else if (answer3b){
                    answer3_score = 1;
                }else if(answer3c){
                    answer3_score = 1;
                }else if (answer3d) {
                    answer3_score = 1;
                }else{
                    answer3_score = 0;
                }

                // Question c - Any option is correct
                Boolean answer4;
                Boolean answer4b;
                Boolean answer4c;
                Boolean answer4d;
                Boolean answer4e;
                Boolean answer4f;
                Boolean answer4g;

                bquestion4_option1 = (RadioButton) findViewById(R.id.bquestion4_option1);
                answer4 = bquestion4_option1.isChecked();
                bquestion4_option2 = (RadioButton) findViewById(R.id.bquestion4_option2);
                answer4b = bquestion4_option2.isChecked();
                bquestion4_option3 = (RadioButton) findViewById(R.id.bquestion4_option3);
                answer4c = bquestion4_option3.isChecked();
                bquestion4_option4 = (RadioButton) findViewById(R.id.bquestion4_option4);
                answer4d = bquestion4_option4.isChecked();
                bquestion4_option5 = (RadioButton) findViewById(R.id.bquestion4_option5);
                answer4e = bquestion4_option5.isChecked();
                bquestion4_option6 = (RadioButton) findViewById(R.id.bquestion4_option6);
                answer4f = bquestion4_option6.isChecked();
                bquestion4_option7 = (RadioButton) findViewById(R.id.bquestion4_option7);
                answer4g = bquestion4_option7.isChecked();

                if (answer4) {
                    answer4_score = 1;
                }else if (answer4b){
                    answer4_score = 1;
                }else if(answer4c){
                    answer4_score = 1;
                }else if (answer4d) {
                    answer4_score = 1;
                }else if (answer4e){
                    answer4_score = 1;
                }else if(answer4f){
                    answer4_score = 1;
                }else if (answer4g) {
                    answer4_score = 1;
                }else{
                    answer4_score = 0;
                }

                // Question 5 - Any option is correct
                Boolean answer5;
                Boolean answer5b;
                bquestion5_option1 = (RadioButton) findViewById(R.id.bquestion5_option1);
                answer5 = bquestion5_option1.isChecked();
                bquestion5_option2 = (RadioButton) findViewById(R.id.bquestion5_option2);
                answer5b = bquestion5_option2.isChecked();

                if (answer5) {
                    answer5_score = 1;
                }else if (answer5b){
                    answer5_score = 1;
                } else{
                    answer5_score = 0;
                }



                final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score;

                    if (final_score == 5) {
                        resultsDisplay = "Great! You scored 5 out of 5";
                    } else {
                        resultsDisplay = "Try again. You scored " + final_score + " out of 5";
                    }

                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, resultsDisplay, duration);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }


        });


    }


   /* public void viewbuildanswer (View view){
        Intent i= new Intent (NpowerBuildActivity.this, BuildAnswerActivity.class);
        startActivity(i);
    }*/

    public void buildreset (View view){
        Intent i= new Intent (NpowerBuildActivity.this, NpowerBuildActivity.class);
        startActivity(i);
    }
}

package com.gconnect.npower;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Health1Activity extends AppCompatActivity {
    private AdView mAdview;

    //Answes to Questions
    // Question a
    RadioButton hquestion1_option4;
    // Question b
    RadioButton hquestion2_option4;
    // Question c
    RadioButton hquestion3_option4;
    // Question 4
    RadioButton hquestion4_option2;
    // Question 5
    RadioButton hquestion5_option2;
    int answer1_score;
    int answer2_score;
    int answer3_score;
    int answer4_score;
    int answer5_score;
    int final_score;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health1); // Locate the NativeExpressAdView.
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-2157637459533575~9189702048");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }

    public void hSubmit(View view) {
        CharSequence resultsDisplay;


        //------------------------------------------------------------------------------------------
        // Question 1- Correct Answer is option_4
        //------------------------------------------------------------------------------------------
        Boolean answer1;
        hquestion1_option4 = (RadioButton) findViewById(R.id.hquestion1_option4);
        answer1 = hquestion1_option4.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question b - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer2;
        hquestion2_option4 = (RadioButton) findViewById(R.id.hquestion1_option4);
        answer2 = hquestion2_option4.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question c - Correct Answer is option_1
        //------------------------------------------------------------------------------------------
        Boolean answer3;
        hquestion3_option4 = (RadioButton) findViewById(R.id.hquestion3_option4);
        answer3 = hquestion3_option4.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer4;
        hquestion4_option2 = (RadioButton) findViewById(R.id.hquestion4_option2);
        answer4 = hquestion4_option2.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 5 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        hquestion5_option2 = (RadioButton) findViewById(R.id.hquestion5_option2);
        answer5 = hquestion5_option2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }
        

        final_score = answer1_score + answer2_score + answer3_score + answer4_score +
                answer5_score;
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
    public void hnext(View view){
        Intent i = new Intent(Health1Activity.this,Health11Activity.class);
        startActivity(i);
    }


}

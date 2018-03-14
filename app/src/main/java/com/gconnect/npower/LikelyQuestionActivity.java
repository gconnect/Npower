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

public class LikelyQuestionActivity extends AppCompatActivity {
    private AdView mAdview;

    //Answes to Questions
    // Question a
    RadioButton lquestion1_option4;
    // Question b
    RadioButton lquestion2_option1;
    // Question c
    RadioButton lquestion3_option2;
    // Question 4
    RadioButton lquestion4_option4;
    // Question 5
    RadioButton lquestion5_option2;
    // Question 6
    RadioButton lquestion6_option3;
    // Question 7
    RadioButton lquestion7_option2;
    // Question 8
    RadioButton lquestion8_option3;
    // Question 9
    RadioButton lquestion9_option1;
    // Question 10
    RadioButton lquestion10_option1;


    int answer1_score;
    int answer2_score;
    int answer3_score;
    int answer4_score;
    int answer5_score;
    int answer6_score;
    int answer7_score;
    int answer8_score;
    int answer9_score;
    int answer10_score;
    int final_score;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likely_question);
        
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-2157637459533575~9189702048");
        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }

    public void lSubmit(View view) {
        CharSequence resultsDisplay;


        //------------------------------------------------------------------------------------------
        // Question a - Correct Answer is option_4
        //------------------------------------------------------------------------------------------
        Boolean answer1;
        lquestion1_option4 = (RadioButton) findViewById(R.id.lquestion1_option4);
        answer1 = lquestion1_option4.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question b - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer2;
        lquestion2_option1 = (RadioButton) findViewById(R.id.lquestion2_option1);
        answer2 = lquestion2_option1.isChecked();
        if (answer2) {
            answer2_score = 1;
            ;
        } else {
            answer2_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question c - Correct Answer is option_1
        //------------------------------------------------------------------------------------------
        Boolean answer3;
        lquestion3_option2 = (RadioButton) findViewById(R.id.lquestion3_option2);
        answer3 = lquestion3_option2.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer4;
        lquestion4_option4 = (RadioButton) findViewById(R.id.lquestion4_option4);
        answer4 = lquestion4_option4.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 5 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        lquestion5_option2 = (RadioButton) findViewById(R.id.lquestion5_option2);
        answer5 = lquestion5_option2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is option_3
        //------------------------------------------------------------------------------------------
        Boolean answer6;
        lquestion6_option3 = (RadioButton) findViewById(R.id.lquestion6_option3);
        answer6 = lquestion6_option3.isChecked();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 7 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer7;
        lquestion7_option2 = (RadioButton) findViewById(R.id.lquestion7_option2);
        answer7 = lquestion7_option2.isChecked();
        if (answer7) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is option_1
        //------------------------------------------------------------------------------------------
        Boolean answer8;
        lquestion8_option3 = (RadioButton) findViewById(R.id.lquestion8_option3);
        answer8 = lquestion8_option3.isChecked();
        if (answer8) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 9 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        lquestion9_option1 = (RadioButton) findViewById(R.id.lquestion9_option1);
        answer9 = lquestion9_option1.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 10 - Any option is Correct
        //------------------------------------------------------------------------------------------
        Boolean answer10;
        lquestion10_option1 = (RadioButton) findViewById(R.id.lquestion10_option1);
        answer10 = lquestion10_option1.isChecked();

        if (answer10) {
            answer10_score = 1;
        }else{
            answer10_score = 0;
        }

        final_score = answer1_score + answer2_score + answer3_score + answer4_score +
                answer5_score + answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;
        if (final_score == 10) {
            resultsDisplay = "Great! You scored 10 out of 10";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }


    public void lreset (View view){
        Intent i= new Intent (LikelyQuestionActivity.this, LikelyQuestionActivity.class);
        startActivity(i);
    }
}

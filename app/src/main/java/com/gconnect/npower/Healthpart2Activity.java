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

public class Healthpart2Activity extends AppCompatActivity {
    private AdView mAdview;
    //Answes to Questions
    // Question a
    RadioButton h2question1_option4;
    // Question b
    RadioButton h2question2_option2;
    // Question c
    RadioButton h2question3_option1;
    // Question 4
    RadioButton h2question4_option2;
    // Question 5
    RadioButton h2question5_option2;
    // Question 6
    RadioButton h2question6_option3;
    // Question 7
    RadioButton h2question7_option2;
    // Question 8
    RadioButton h2question8_option1;
    // Question 9
    RadioButton h2question9_option2;
    // Question 10
    RadioButton h2question10_option1;
    RadioButton h2question10_option2;

    //question11
    RadioButton h2question11_option1;
    RadioButton h2question11_option2;

    //question12
    RadioButton h2question12_option1;
    RadioButton h2question12_option2;
    RadioButton h2question12_option3;

    //question13
    RadioButton h2question13_option1;
    RadioButton h2question13_option2;


    //question14
    RadioButton h2question14_option1;
    RadioButton h2question14_option2;

    //question15
    RadioButton h2question15_option1;
    RadioButton h2question15_option2;
    RadioButton h2question15_option3;
    RadioButton h2question15_option4;

    //question16
    RadioButton h2question16_option1;



    /* int totalScore;
     int score = a;*/
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
    int answer11_score;
    int answer12_score;
    int answer13_score;
    int answer14_score;
    int answer15_score;
    int answer16_score;
    int final_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthpart2);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-2157637459533575~9189702048");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }

        public void h2Submit(View view) {
            CharSequence resultsDisplay;


            //------------------------------------------------------------------------------------------
            // Question a - Correct Answer is option_4
            //------------------------------------------------------------------------------------------
            Boolean answer1;
            h2question1_option4 = (RadioButton) findViewById(R.id.h2question1_option4);
            answer1 = h2question1_option4.isChecked();
            if (answer1) {
                answer1_score = 1;
            } else {
                answer1_score = 0;
            }

            //------------------------------------------------------------------------------------------
            // Question b - Correct Answer is option_2
            //------------------------------------------------------------------------------------------
            Boolean answer2;
            h2question2_option2 = (RadioButton) findViewById(R.id.h2question2_option2);
            answer2 = h2question2_option2.isChecked();
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
            h2question3_option1 = (RadioButton) findViewById(R.id.h2question3_option1);
            answer3 = h2question3_option1.isChecked();
            if (answer3) {
                answer3_score = 1;
            } else {
                answer3_score = 0;
            }

            //------------------------------------------------------------------------------------------
            // Question 4 - Correct Answer is option_2
            //------------------------------------------------------------------------------------------
            Boolean answer4;
            h2question4_option2 = (RadioButton) findViewById(R.id.h2question4_option2);
            answer4 = h2question4_option2.isChecked();
            if (answer4) {
                answer4_score = 1;
            } else {
                answer4_score = 0;
            }

            //------------------------------------------------------------------------------------------
            // Question 5 - Correct Answer is option_2
            //------------------------------------------------------------------------------------------
            Boolean answer5;
            h2question5_option2 = (RadioButton) findViewById(R.id.h2question5_option2);
            answer5 = h2question5_option2.isChecked();
            if (answer5) {
                answer5_score = 1;
            } else {
                answer5_score = 0;
            }

            //------------------------------------------------------------------------------------------
            // Question 6 - Correct Answer is option_3
            //------------------------------------------------------------------------------------------
            Boolean answer6;
            h2question6_option3 = (RadioButton) findViewById(R.id.h2question6_option3);
            answer6 = h2question6_option3.isChecked();
            if (answer6) {
                answer6_score = 1;
            } else {
                answer6_score = 0;
            }

            //------------------------------------------------------------------------------------------
            // Question 7 - Correct Answer is option_2
            //------------------------------------------------------------------------------------------
            Boolean answer7;
            h2question7_option2 = (RadioButton) findViewById(R.id.h2question7_option2);
            answer7 = h2question7_option2.isChecked();
            if (answer7) {
                answer7_score = 1;
            } else {
                answer7_score = 0;
            }

            //------------------------------------------------------------------------------------------
            // Question 8 - Correct Answer is option_1
            //------------------------------------------------------------------------------------------
            Boolean answer8;
            h2question8_option1 = (RadioButton) findViewById(R.id.h2question8_option1);
            answer8 = h2question8_option1.isChecked();
            if (answer8) {
                answer8_score = 1;
            } else {
                answer8_score = 0;
            }

            //------------------------------------------------------------------------------------------
            // Question 9 - Correct Answer is option_2
            //------------------------------------------------------------------------------------------
            Boolean answer9;
            h2question9_option2 = (RadioButton) findViewById(R.id.h2question9_option2);
            answer9 = h2question9_option2.isChecked();
            if (answer9) {
                answer9_score = 1;
            } else {
                answer9_score = 0;
            }

            //------------------------------------------------------------------------------------------
            // Question 10 - Any option is Correct
            //------------------------------------------------------------------------------------------
        Boolean answer10;
        Boolean answer10b;
        h2question10_option1 = (RadioButton) findViewById(R.id.h2question10_option1);
        answer10 = h2question10_option1.isChecked();
        h2question10_option2 = (RadioButton) findViewById(R.id.h2question10_option2);
        answer10b = h2question10_option2.isChecked();

        if (answer10) {
            answer10_score = 1;
        }else if (answer10b){
            answer10_score = 1;
        } else{
            answer10_score = 0;
        }

            // Question 11 - Any option is correct
            Boolean answer11;
            Boolean answer11b;
            h2question11_option1 = (RadioButton) findViewById(R.id.h2question11_option1);
            answer11 = h2question11_option1.isChecked();
            h2question11_option2 = (RadioButton) findViewById(R.id.h2question11_option2);
            answer11b = h2question11_option2.isChecked();

            if (answer11) {
                answer11_score = 1;
            }else if (answer11b){
                answer11_score = 1;
            } else{
                answer11_score = 0;
            }

            // Question 12 - Any option is correct
            Boolean answer12;
            Boolean answer12b;
            Boolean answer12c;
            h2question12_option1 = (RadioButton) findViewById(R.id.h2question12_option1);
            answer12 = h2question12_option1.isChecked();
            h2question12_option2 = (RadioButton) findViewById(R.id.h2question12_option2);
            answer12b = h2question12_option2.isChecked();
            h2question12_option3 = (RadioButton) findViewById(R.id.h2question12_option3);
            answer12c = h2question12_option3.isChecked();

            if (answer12) {
                answer12_score = 1;
            }else if (answer12b){
                answer12_score = 1;
            } else if (answer12c){
                answer12_score = 1;
            } else{
                answer12_score = 0;
            }


            // Question 13 - Any option is correct
            Boolean answer13;
            Boolean answer13b;
            h2question13_option1 = (RadioButton) findViewById(R.id.h2question13_option1);
            answer13 = h2question13_option1.isChecked();
            h2question13_option2 = (RadioButton) findViewById(R.id.h2question13_option2);
            answer13b = h2question13_option2.isChecked();

            if (answer13) {
                answer13_score = 1;
            }else if (answer13b){
                answer13_score = 1;
            } else{
                answer13_score = 0;
            }


            // Question 14 - Any option is correct
            Boolean answer14;
            Boolean answer14b;
            h2question14_option1 = (RadioButton) findViewById(R.id.h2question14_option1);
            answer14 = h2question14_option1.isChecked();
            h2question14_option2 = (RadioButton) findViewById(R.id.h2question14_option2);
            answer14b = h2question14_option2.isChecked();

            if (answer14) {
                answer14_score = 1;
            }else if (answer14b){
                answer14_score = 1;
            } else{
                answer14_score = 0;
            }


            // Question 15 - Any option is correct
            Boolean answer15;
            Boolean answer15b;
            Boolean answer15c;
            Boolean answer15d;
            h2question15_option1 = (RadioButton) findViewById(R.id.h2question15_option1);
            answer15 = h2question15_option1.isChecked();
            h2question15_option2 = (RadioButton) findViewById(R.id.h2question15_option2);
            answer15b = h2question15_option2.isChecked();
            h2question15_option3 = (RadioButton) findViewById(R.id.h2question15_option3);
            answer15c = h2question15_option3.isChecked();
            h2question15_option4 = (RadioButton) findViewById(R.id.h2question15_option4);
            answer15d = h2question15_option4.isChecked();

            if (answer15) {
                answer15_score = 1;
            }else if (answer15b){
                answer15_score = 1;
            } else if (answer15c){
                answer15_score = 1;
            }else if (answer15d){
                answer15_score = 1;
            } else{
                answer15_score = 0;
            }

            // Question 16 - Any option is correct
            Boolean answer16;
            h2question16_option1 = (RadioButton) findViewById(R.id.h2question16_option1);
            answer16 = h2question16_option1.isChecked();


            if (answer16) {
                answer16_score = 1;
            }else{
                answer16_score = 0;
            }

            final_score = answer1_score + answer2_score + answer3_score + answer4_score +
                    answer5_score + answer6_score + answer7_score + answer8_score + answer9_score + answer10_score+
                    answer11_score + answer12_score + answer13_score + answer14_score +
                    answer15_score + answer16_score ;
            if (final_score == 16) {
                resultsDisplay = "Great! You scored 16 out of 16";
            } else {
                resultsDisplay = "Try again. You scored " + final_score + " out of 16";
            }

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, resultsDisplay, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();

        }


    public void h2reset (View view){
        Intent i= new Intent (Healthpart2Activity.this, Healthpart2Activity.class);
        startActivity(i);
    }
}

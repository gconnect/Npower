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
import com.google.android.gms.ads.NativeExpressAdView;
import com.google.android.gms.ads.VideoController;


public class EducationActivity extends AppCompatActivity {
    private static String LOG_TAG = "EXAMPLE";

    NativeExpressAdView mAdView;
    VideoController mVideoController;
    //Answes to Questions
    // Question a
    RadioButton cquestion1_option3;
    // Question b
    RadioButton cquestion2_option4;
    // Question c
    RadioButton cquestion3_option2;
    // Question 5
    RadioButton cquestion5_option1;
    // Question 6
    RadioButton cquestion6_option1;
    // Question 7
    RadioButton cquestion7_option1;
    // Question 8
    RadioButton cquestion8_option4;
    // Question 9
    RadioButton cquestion9_option3;
   
    // Question 10
    RadioButton cquestion10_option2;
    
    
    //question11 personal answer
    RadioButton cquestion11_option1;
    RadioButton cquestion11_option2;
    
    //question12 personal
    RadioButton cquestion12_option1;
    RadioButton cquestion12_option2;
   
    //question13 personal
    RadioButton cquestion13_option1;
    RadioButton cquestion13_option2;
    RadioButton cquestion13_option3;
    
    //question14 personal
    RadioButton cquestion14_option1;
    RadioButton cquestion14_option2;
  
    //question15 personal
    RadioButton cquestion15_option1;
    RadioButton cquestion15_option2;
    
    //question16 personal
    RadioButton cquestion16_option1;
    RadioButton cquestion16_option2;
    RadioButton cquestion16_option3;
    RadioButton cquestion16_option4;

   

    
    int answer1_score;
    int answer2_score;
    int answer3_score;
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

    private AdView mAdview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        MobileAds.initialize(getApplicationContext(),"ca-app-pub-2157637459533575~9189702048");

        mAdview =(AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

    }

    public void cSubmit(View view) {
        CharSequence resultsDisplay;


        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is option_3
        //------------------------------------------------------------------------------------------
        Boolean answer1;
        cquestion1_option3 = (RadioButton) findViewById(R.id.cquestion1_option3);
        answer1 = cquestion1_option3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 2- Correct Answer is option_3
        //------------------------------------------------------------------------------------------
        Boolean answer2;
        cquestion2_option4 = (RadioButton) findViewById(R.id.cquestion2_option4);
        answer2 = cquestion2_option4.isChecked();
        if (answer2) {
            answer2_score = 1;
            ;
        } else {
            answer2_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 3 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer3;
        cquestion3_option2 = (RadioButton) findViewById(R.id.cquestion3_option2);
        answer3 = cquestion3_option2.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }


        //------------------------------------------------------------------------------------------
        // Question 5 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        cquestion5_option1 = (RadioButton) findViewById(R.id.cquestion5_option1);
        answer5 = cquestion5_option1.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is option_3
        //------------------------------------------------------------------------------------------
        Boolean answer6;
        cquestion6_option1 = (RadioButton) findViewById(R.id.cquestion6_option1);
        answer6 = cquestion6_option1.isChecked();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 7 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer7;
        cquestion7_option1 = (RadioButton) findViewById(R.id.cquestion7_option1);
        answer7 = cquestion7_option1.isChecked();
        
        if (answer7) {
            answer7_score = 1;
        } else{
            answer7_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is option_1
        //------------------------------------------------------------------------------------------
        Boolean answer8;
        cquestion8_option4 = (RadioButton) findViewById(R.id.cquestion8_option4);
        answer8 = cquestion8_option4.isChecked();
        if (answer8) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 9 - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        cquestion9_option3 = (RadioButton) findViewById(R.id.cquestion9_option3);
        answer9 = cquestion9_option3.isChecked();
        
        if (answer9) {
            answer9_score = 1;
        } else{
            answer9_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 10 - Any option is Correct
        //------------------------------------------------------------------------------------------
        Boolean answer10;
        cquestion10_option2 = (RadioButton) findViewById(R.id.cquestion10_option2);
        answer10 = cquestion10_option2.isChecked();
        
        if (answer10) {
            answer10_score = 1;
        }else{
            answer10_score = 0;
        }

        // Question 11 - Any option is correct
        Boolean answer11;
        Boolean answer11b;
        cquestion11_option1 = (RadioButton) findViewById(R.id.cquestion11_option1);
        answer11 = cquestion11_option1.isChecked();
        cquestion11_option2 = (RadioButton) findViewById(R.id.cquestion11_option2);
        answer11b = cquestion11_option2.isChecked();
        if (answer11) {
            answer11_score = 1;
        }else if (answer11b){
            answer12_score = 1;
        } else {
            answer11_score = 0;
        }

        // Question 12 - Any option is correct
        Boolean answer12;
        Boolean answer12b;
        cquestion12_option1 = (RadioButton) findViewById(R.id.cquestion12_option1);
        answer12 = cquestion12_option1.isChecked();
        cquestion12_option2 = (RadioButton) findViewById(R.id.cquestion12_option2);
        answer12b = cquestion12_option2.isChecked();

        if (answer12) {
            answer12_score = 1;
        }else if (answer12b){
            answer12_score = 1;
        }  else{
            answer12_score = 0;
        }


        // Question 13 - Any option is correct
        Boolean answer13;
        Boolean answer13b;
        Boolean answer13c;
        cquestion13_option1 = (RadioButton) findViewById(R.id.cquestion13_option1);
        answer13 = cquestion13_option1.isChecked();
        cquestion13_option2 = (RadioButton) findViewById(R.id.cquestion13_option2);
        answer13b = cquestion13_option2.isChecked();
        cquestion13_option3 = (RadioButton) findViewById(R.id.cquestion13_option3);
        answer13c = cquestion13_option3.isChecked();

        if (answer13) {
            answer13_score = 1;
        }else if (answer13b){
            answer13_score = 1;
        } else if (answer13c){
            answer13_score = 1;
        }else{
            answer13_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 14 - Any option is correct
        //------------------------------------------------------------------------------------------
        Boolean answer14;
        Boolean answer14b;
        cquestion14_option1 = (RadioButton) findViewById(R.id.cquestion14_option1);
        answer14 = cquestion14_option1.isChecked();
        cquestion14_option2 = (RadioButton) findViewById(R.id.cquestion14_option2);
        answer14b = cquestion14_option2.isChecked();

        if (answer14) {
            answer14_score = 1;
        }else if (answer14b){
            answer14_score = 1;
        } else{
            answer14_score = 0;
        }



        // Question 15- Any option is correct
        Boolean answer15;
        Boolean answer15b;
        cquestion15_option1 = (RadioButton) findViewById(R.id.cquestion15_option1);
        answer15 = cquestion15_option1.isChecked();
        cquestion15_option2 = (RadioButton) findViewById(R.id.cquestion15_option2);
        answer15b = cquestion15_option2.isChecked();

        if (answer15) {
            answer15_score = 1;
        }else if (answer15b){
            answer15_score = 1;
        } else{
            answer15_score = 0;
        }


        // Question 16 - Any option is correct
        Boolean answer16;
        Boolean answer16b;
        Boolean answer16c;
        Boolean answer16d;
        cquestion16_option1 = (RadioButton) findViewById(R.id.cquestion16_option1);
        answer16 = cquestion16_option1.isChecked();
        cquestion16_option2 = (RadioButton) findViewById(R.id.cquestion16_option2);
        answer16b = cquestion16_option2.isChecked();
        cquestion16_option3 = (RadioButton) findViewById(R.id.cquestion16_option3);
        answer16c = cquestion16_option3.isChecked();
        cquestion16_option4 = (RadioButton) findViewById(R.id.cquestion16_option4);
        answer16d = cquestion16_option4.isChecked();

        if (answer16) {
            answer16_score = 1;
        }else if (answer16b){
            answer16_score = 1;
        } else if (answer16c){
            answer16_score = 1;
        }else if (answer16d){
            answer16_score = 1;
        } else{
            answer16_score = 0;
        }



        final_score = answer1_score + answer2_score + answer3_score +
                answer5_score + answer6_score + answer7_score + answer8_score + answer9_score + answer10_score+
                answer11_score + answer12_score + answer13_score + answer14_score +
                answer15_score + answer16_score ;
        if (final_score == 15) {
            resultsDisplay = "Great! You scored 15 out of 15";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 15";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }


    public void creset (View view){
        Intent i= new Intent (EducationActivity.this, EducationActivity.class);
        startActivity(i);
    }
}

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

public class Health11Activity extends AppCompatActivity {
    private AdView mAdview;

    //Answes to Questions
    // Question a
    RadioButton hquestion6_option2;
    // Question b
    RadioButton hquestion7_option1;
    // Question c
    RadioButton hquestion10_option1;
    RadioButton hquestion10_option2;
    // Question 4
    RadioButton hquestion8_option4;
    // Question 5
    RadioButton hquestion11_option1;
    RadioButton hquestion11_option2;
    // Question 6
    RadioButton hquestion12_option1;
    RadioButton hquestion12_option2;
    RadioButton hquestion12_option3;

    // Question 7
    RadioButton hquestion13_option1;
    RadioButton hquestion13_option2;

    // Question 8
    RadioButton hquestion14_option1;
    RadioButton hquestion14_option2;
    
    // Question 9
    RadioButton hquestion15_option1;
    RadioButton hquestion15_option2;
    RadioButton hquestion15_option3;
    RadioButton hquestion15_option4;

    // Question 10
    RadioButton hquestion16_option5;


    int answer6_score;
    int answer7_score;
    int answer10_score;
    int answer8_score;
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
        setContentView(R.layout.activity_health11);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-2157637459533575~9189702048");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }

    public void hbSubmit(View view) {
        CharSequence resultsDisplay;


        //------------------------------------------------------------------------------------------
        // Question a - Correct Answer is option_2
        //------------------------------------------------------------------------------------------
        Boolean answer6;
        hquestion6_option2 = (RadioButton) findViewById(R.id.hquestion6_option2);
        answer6 = hquestion6_option2.isChecked();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }


        //------------------------------------------------------------------------------------------
        // Question b - Correct Answer is option_1
        //------------------------------------------------------------------------------------------
        Boolean answer7;
        hquestion7_option1 = (RadioButton) findViewById(R.id.hquestion7_option1);
        answer7 = hquestion7_option1.isChecked();
        if (answer7) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        // Question c - Any option is correct
        Boolean answer10;
        Boolean answer10b;
        hquestion10_option1 = (RadioButton) findViewById(R.id.hquestion10_option1);
        answer10 = hquestion10_option1.isChecked();
        hquestion10_option2 = (RadioButton) findViewById(R.id.hquestion10_option2);
        answer10b = hquestion10_option2.isChecked();

        if (answer10) {
            answer10_score = 1;
        }else if (answer10b){
            answer10_score = 1;
        } else{
            answer10_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is option_4
        //------------------------------------------------------------------------------------------
        Boolean answer8;
        hquestion8_option4 = (RadioButton) findViewById(R.id.hquestion8_option4);
        answer8 = hquestion8_option4.isChecked();
        if (answer8) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        // Question 5 - Any option is correct
        Boolean answer11;
        Boolean answer11b;
        hquestion11_option1 = (RadioButton) findViewById(R.id.hquestion11_option1);
        answer11 = hquestion11_option1.isChecked();
        hquestion11_option2 = (RadioButton) findViewById(R.id.hquestion11_option2);
        answer11b = hquestion11_option2.isChecked();

        if (answer11) {
            answer11_score = 1;
        }else if (answer11b){
            answer11_score = 1;
        } else{
            answer11_score = 0;
        }

        // Question 6 - Any option is correct
        Boolean answer12;
        Boolean answer12b;
        Boolean answer12c;
        hquestion12_option1 = (RadioButton) findViewById(R.id.hquestion12_option1);
        answer12 = hquestion12_option1.isChecked();
        hquestion12_option2 = (RadioButton) findViewById(R.id.hquestion12_option2);
        answer12b = hquestion12_option2.isChecked();
        hquestion12_option3 = (RadioButton) findViewById(R.id.hquestion12_option3);
        answer12c = hquestion12_option3.isChecked();

        if (answer12) {
            answer12_score = 1;
        }else if (answer12b){
            answer12_score = 1;
        }else if (answer12c){
            answer12_score = 1;
        } else{
            answer12_score = 0;
        }


        // Question 7 - Any option is correct
        Boolean answer13;
        Boolean answer13b;
        hquestion13_option1 = (RadioButton) findViewById(R.id.hquestion13_option1);
        answer13 = hquestion13_option1.isChecked();
        hquestion13_option2 = (RadioButton) findViewById(R.id.hquestion13_option2);
        answer13b = hquestion13_option2.isChecked();

        if (answer13) {
            answer13_score = 1;
        }else if (answer13b){
            answer13_score = 1;
        } else{
            answer13_score = 0;
        }

        // Question 8 - Any option is correct
        Boolean answer14;
        Boolean answer14b;
        hquestion14_option1 = (RadioButton) findViewById(R.id.hquestion14_option1);
        answer14 = hquestion14_option1.isChecked();
        hquestion14_option2 = (RadioButton) findViewById(R.id.hquestion14_option2);
        answer14b = hquestion14_option2.isChecked();

        if (answer14) {
            answer14_score = 1;
        }else if (answer14b){
            answer14_score = 1;
        } else{
            answer14_score = 0;
        }

        // Question 9- Any option is correct
        Boolean answer15;
        Boolean answer15b;
        Boolean answer15c;
        Boolean answer15d;
        hquestion15_option1 = (RadioButton) findViewById(R.id.hquestion15_option1);
        answer15 = hquestion15_option1.isChecked();
        hquestion15_option2 = (RadioButton) findViewById(R.id.hquestion15_option2);
        answer15b = hquestion15_option2.isChecked();
        hquestion15_option3 = (RadioButton) findViewById(R.id.hquestion15_option3);
        answer15c = hquestion15_option3.isChecked();
        hquestion15_option4 = (RadioButton) findViewById(R.id.hquestion15_option4);
        answer15d = hquestion15_option4.isChecked();

        if (answer15) {
            answer15_score = 1;
        }else if (answer15b){
            answer15_score = 1;
        }else if (answer15c){
            answer15_score = 1;
        }else if (answer15d){
            answer15_score = 1;
        } else{
            answer15_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 10 - Correct Answer is option_5
        //------------------------------------------------------------------------------------------
        Boolean answer16;
        hquestion16_option5 = (RadioButton) findViewById(R.id.hquestion16_option5);
        answer16 = hquestion16_option5.isChecked();
        if (answer16) {
            answer16_score = 1;
        } else {
            answer16_score = 0;
        }

        final_score = answer6_score + answer7_score + answer10_score + answer8_score +
                answer11_score+ answer12_score + answer13_score + answer14_score + answer15_score + answer16_score;
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
    public void hbreset(View view){
        Intent i = new Intent(Health11Activity.this,Health1Activity.class);
        startActivity(i);
    }



}

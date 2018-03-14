package com.gconnect.npower;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class TeachActivity extends AppCompatActivity {
    private AdView mAdview;
    // /Answes to Questions
    // Question a
    RadioButton tquestion1_option5;
    // Question b
    RadioButton tquestion2_option4;
    // Question c
    RadioButton tquestion3_option1;
    // Question 4
    RadioButton tquestion4_option4;
    // Question 5
    RadioButton tquestion5_option3;
    // Question 6
    RadioButton tquestion6_option1;
    // Question 7
    RadioButton tquestion7_option4;
    // Question 8
    RadioButton tquestion8_option2;
    // Question 9
    RadioButton tquestion9_option3;
    // Question 10
    RadioButton tquestion10_option4;


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
    int final_score;

    /*TextView text1;

    private static final String FORMAT = "%02d:%02d:%02d";

    int seconds , minutes*/;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach);

        MobileAds.initialize(getApplicationContext(),"ca-app-pub-2157637459533575~9189702048");

        mAdview =(AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);




//             text1.setText("seconds remaining: "+millisUntilFinished/1000);

  /*              text1 = (TextView) findViewById(R.id.ttime);

                new CountDownTimer(30000, 1000) { // adjust the milli seconds here

                    public void onTick(long millisUntilFinished) {

                        text1.setText("" + String.format("%d min, %d sec",
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                                TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                    }

                    public void onFinish() {
                        new AlertDialog.Builder(TeachActivity.this).setTitle("Time Up!").setMessage
                                ("Try Again").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                TeachActivity.this.finish();
                            }
                        }).setNegativeButton("No", null).show();
//                        text1.setText("done!");
                    }
                }.start();*/


            }


            public void teachSubmit(View view) {
                CharSequence resultsDisplay;


                //------------------------------------------------------------------------------------------
                // Question a - Correct Answer is option_5
                //------------------------------------------------------------------------------------------
                Boolean answer1;
                tquestion1_option5 = (RadioButton) findViewById(R.id.tquestion1_option5);
                answer1 = tquestion1_option5.isChecked();
                if (answer1) {
                    answer1_score = 1;
                } else {
                    answer1_score = 0;
                }

                //------------------------------------------------------------------------------------------
                // Question b - Correct Answer is option_4
                //------------------------------------------------------------------------------------------
                Boolean answer2;
                tquestion2_option4 = (RadioButton) findViewById(R.id.tquestion2_option4);
                answer2 = tquestion2_option4.isChecked();
                if (answer2) {
                    answer2_score = 1;
                } else {
                    answer2_score = 0;
                }

                //------------------------------------------------------------------------------------------
                // Question c - Correct Answer is option_4
                //------------------------------------------------------------------------------------------
                Boolean answer3;
                tquestion3_option1 = (RadioButton) findViewById(R.id.tquestion3_option1);
                answer3 = tquestion3_option1.isChecked();
                if (answer3) {
                    answer3_score = 1;
                } else {
                    answer3_score = 0;
                }

                //------------------------------------------------------------------------------------------
                // Question 4 - Correct Answer is option_4
                //------------------------------------------------------------------------------------------
                Boolean answer4;
                tquestion4_option4 = (RadioButton) findViewById(R.id.tquestion4_option4);
                answer4 = tquestion4_option4.isChecked();
                if (answer4) {
                    answer4_score = 1;
                } else {
                    answer4_score = 0;
                }

                //------------------------------------------------------------------------------------------
                // Question 5 - Correct Answer is option_3
                //------------------------------------------------------------------------------------------
                Boolean answer5;
                tquestion5_option3 = (RadioButton) findViewById(R.id.tquestion5_option3);
                answer5 = tquestion5_option3.isChecked();
                if (answer5) {
                    answer5_score = 1;
                } else {
                    answer5_score = 0;
                }

                //------------------------------------------------------------------------------------------
                // Question 6 - Correct Answer is option_1
                //------------------------------------------------------------------------------------------
                Boolean answer6;
                tquestion6_option1 = (RadioButton) findViewById(R.id.tquestion6_option1);
                answer6 = tquestion6_option1.isChecked();
                if (answer6) {
                    answer6_score = 1;
                } else {
                    answer6_score = 0;
                }

                //------------------------------------------------------------------------------------------
                // Question 7 - Correct Answer is option_4
                //------------------------------------------------------------------------------------------
                Boolean answer7;
                tquestion7_option4 = (RadioButton) findViewById(R.id.tquestion7_option4);
                answer7 = tquestion7_option4.isChecked();
                if (answer7) {
                    answer7_score = 1;
                } else {
                    answer7_score = 0;
                }

                //------------------------------------------------------------------------------------------
                // Question 8 - Correct Answer is option_2
                //------------------------------------------------------------------------------------------
                Boolean answer8;
                tquestion8_option2 = (RadioButton) findViewById(R.id.tquestion8_option2);
                answer8 = tquestion8_option2.isChecked();
                if (answer8) {
                    answer8_score = 1;
                } else {
                    answer8_score = 0;
                }

                //------------------------------------------------------------------------------------------
                // Question 9 - Correct Answer is option_3
                //------------------------------------------------------------------------------------------
                Boolean answer9;
                tquestion9_option3 = (RadioButton) findViewById(R.id.tquestion9_option3);
                answer9 = tquestion9_option3.isChecked();
                if (answer9) {
                    answer9_score = 1;
                } else {
                    answer9_score = 0;
                }

                //------------------------------------------------------------------------------------------
                // Question 10 - Correct Answer is option_4
                //------------------------------------------------------------------------------------------
                Boolean answer10;
                tquestion10_option4 = (RadioButton) findViewById(R.id.tquestion10_option4);
                answer10 = tquestion10_option4.isChecked();
                if (answer10) {
                    answer10_score = 1;
                } else {
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


            public void next(View v) {

                ViewGroup layouta = (ViewGroup) findViewById(R.id.layouta);
                ViewGroup layout = (ViewGroup) findViewById(R.id.layout);
                ViewGroup submitreset = (ViewGroup) findViewById(R.id.submitreset);
                ViewGroup layout1 = (ViewGroup) findViewById(R.id.layout1);
                ViewGroup layout2 = (ViewGroup) findViewById(R.id.layout2);
                ViewGroup layout3 = (ViewGroup) findViewById(R.id.layout3);
                ViewGroup layout4 = (ViewGroup) findViewById(R.id.layout4);
                ViewGroup layout5 = (ViewGroup) findViewById(R.id.layout5);
                ViewGroup layout6 = (ViewGroup) findViewById(R.id.layout6);
                ViewGroup layout7 = (ViewGroup) findViewById(R.id.layout7);
                ViewGroup layout8 = (ViewGroup) findViewById(R.id.layout8);
                ViewGroup layout9 = (ViewGroup) findViewById(R.id.layout9);
                ViewGroup layout10 = (ViewGroup) findViewById(R.id.layout10);


                if (layout1.getVisibility() == View.VISIBLE) {
                    layout1.setVisibility(View.GONE);
                    layout2.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout2.getVisibility() == View.VISIBLE) {
                    layout2.setVisibility(View.GONE);
                    layout3.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);

                } else if (layout3.getVisibility() == View.VISIBLE) {
                    layout3.setVisibility(View.GONE);
                    layout4.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout4.getVisibility() == View.VISIBLE) {
                    layout4.setVisibility(View.GONE);
                    layout5.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout5.getVisibility() == View.VISIBLE) {
                    layout5.setVisibility(View.GONE);
                    layout6.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout6.getVisibility() == View.VISIBLE) {
                    layout6.setVisibility(View.GONE);
                    layout7.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout7.getVisibility() == View.VISIBLE) {
                    layout7.setVisibility(View.GONE);
                    layout8.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout8.getVisibility() == View.VISIBLE) {
                    layout8.setVisibility(View.GONE);
                    layout9.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout9.getVisibility() == View.VISIBLE) {
                    layout9.setVisibility(View.GONE);
                    layout.setVisibility(View.GONE);
                    layouta.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);
                    submitreset.setVisibility(View.VISIBLE);
                    layout10.setVisibility(View.VISIBLE);
//                    previouslayout.setVisibility(View.VISIBLE);
                } else {
           layout10.setVisibility(View.VISIBLE);
                    layout1.setVisibility(View.GONE);
//            layout.setVisibility(View.GONE);
//            layout2.setVisibility(View.VISIBLE);

                    submitreset.setVisibility(View.VISIBLE);
                }

            }


/*            public void previous(View v) {

                ViewGroup layouta = (ViewGroup) findViewById(R.id.layouta);
                ViewGroup layout = (ViewGroup) findViewById(R.id.layout);
                ViewGroup submitreset = (ViewGroup) findViewById(R.id.submitreset);
                ViewGroup previouslayout = (ViewGroup) findViewById(R.id.previouslayout);
                ViewGroup layout1 = (ViewGroup) findViewById(R.id.layout1);
                ViewGroup layout2 = (ViewGroup) findViewById(R.id.layout2);
                ViewGroup layout3 = (ViewGroup) findViewById(R.id.layout3);
                ViewGroup layout4 = (ViewGroup) findViewById(R.id.layout4);
                ViewGroup layout5 = (ViewGroup) findViewById(R.id.layout5);
                ViewGroup layout6 = (ViewGroup) findViewById(R.id.layout6);
                ViewGroup layout7 = (ViewGroup) findViewById(R.id.layout7);
                ViewGroup layout8 = (ViewGroup) findViewById(R.id.layout8);
                ViewGroup layout9 = (ViewGroup) findViewById(R.id.layout9);
                ViewGroup layout10 = (ViewGroup) findViewById(R.id.layout10);


                if (layout1.getVisibility() == View.GONE) {
                    layout1.setVisibility(View.VISIBLE);
                    layout2.setVisibility(View.GONE);
                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout2.getVisibility() == View.VISIBLE) {
                    layout2.setVisibility(View.GONE);
                    layout3.setVisibility(View.VISIBLE);
                    previouslayout.setVisibility(View.VISIBLE);

                } else if (layout3.getVisibility() == View.VISIBLE) {
                    layout3.setVisibility(View.GONE);
                    layout4.setVisibility(View.VISIBLE);
                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout4.getVisibility() == View.VISIBLE) {
                    layout4.setVisibility(View.GONE);
                    layout5.setVisibility(View.VISIBLE);
                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout5.getVisibility() == View.VISIBLE) {
                    layout5.setVisibility(View.GONE);
                    layout6.setVisibility(View.VISIBLE);
                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout6.getVisibility() == View.VISIBLE) {
                    layout6.setVisibility(View.GONE);
                    layout7.setVisibility(View.VISIBLE);
                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout7.getVisibility() == View.VISIBLE) {
                    layout7.setVisibility(View.GONE);
                    layout8.setVisibility(View.VISIBLE);
                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout8.getVisibility() == View.VISIBLE) {
                    layout8.setVisibility(View.GONE);
                    layout9.setVisibility(View.VISIBLE);
                    previouslayout.setVisibility(View.VISIBLE);
                } else if (layout9.getVisibility() == View.VISIBLE) {
                    layout9.setVisibility(View.GONE);
                    layout.setVisibility(View.GONE);
                    layouta.setVisibility(View.VISIBLE);
                    previouslayout.setVisibility(View.VISIBLE);
                    submitreset.setVisibility(View.VISIBLE);
                    layout10.setVisibility(View.VISIBLE);
                    previouslayout.setVisibility(View.VISIBLE);
                } else {
                layout10.setVisibility(View.GONE);
                    layout1.setVisibility(View.GONE);
         /// layout.setVisibility(View.VISIBLE);
//            layout2.setVisibility(View.VISIBLE);
                    layout10.setVisibility(View.GONE);
                    submitreset.setVisibility(View.VISIBLE);
                }

            }*/


            public void reset(View view) {

                Intent reset = new Intent(TeachActivity.this, TeachActivity.class);
                startActivity(reset);

            }


        }

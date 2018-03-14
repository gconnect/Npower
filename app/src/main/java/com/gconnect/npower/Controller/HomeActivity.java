package com.gconnect.npower.Controller;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.gconnect.npower.AboutActivity;
import com.gconnect.npower.CommunityEducation.CommunityEducationActivity;
import com.gconnect.npower.ContactActivity;
import com.gconnect.npower.InstructionActivity;
import com.gconnect.npower.Model.CustomAdapter;
import com.gconnect.npower.Model.GridViewItem;
import com.gconnect.npower.NpowerBuildTab1Activity.NpowerBuild1Activity;
import com.gconnect.npower.NpowerGeneralQuestion.GeneralQuestionActivity;
import com.gconnect.npower.NpowerHealth.NpowerHealthActivity;
import com.gconnect.npower.NpowerLikelyActivity;
import com.gconnect.npower.NpowerTeach.NpowerTeachActivity;
import com.gconnect.npower.PrivacyActivity;
import com.gconnect.npower.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;


public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private AdView mAdview;
     public GridView gridview;
    ArrayList<GridViewItem> data = new ArrayList();



      private static String [] app_name = {
              "About",
              "Npower Build/Agro Test",
              "Test Instruction",
              "Npower Teach Test",
              "Npower Health Test",
              "Npower Tax",
              "Npower Community Education Test",
              "Npower General Questions",
              "Rate us",
              "Exit"
      };

      private static int [] app_icon = {
              R.drawable.npower,
              R.drawable.build1,
              R.drawable.instruction,
              R.drawable.teach22,
              R.drawable.doctor,
              R.drawable.tax3,
              R.drawable.education,
              R.drawable.tax2,
             R.drawable.rate24,
              R.drawable.exit13
      };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        MobileAds.initialize(getApplicationContext(),"ca-app-pub-2157637459533575~9189702048");

        mAdview =(AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);


        gridview=(GridView)findViewById(R.id.grid_view);
        // setting up Adapter tp GridView
        gridview.setAdapter(new CustomAdapter(this,app_name,app_icon));



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Gconnect Innovation Hub" +  " \nCheck out this Npower Past Questions, " +
                            "\nhttps://play.google.com/store/apps/details?id=com.gconnect.npower ");
                            startActivity(Intent.createChooser(shareIntent, "From Gconnect"
                            ));
            }

        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        this.gridview = (GridView) findViewById(R.id.grid_view);
        this.gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), AboutActivity.class));
                } else if (position == 1) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), NpowerBuild1Activity.class));
                } else if (position == 2) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), InstructionActivity.class));
                } else if (position == 3) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), NpowerTeachActivity.class));
                } else if (position == 4) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), NpowerHealthActivity.class));
                } else if (position == 5) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), NpowerLikelyActivity.class ));
                } else if (position == 6) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(),CommunityEducationActivity.class ));
                } else if (position == 7) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(),GeneralQuestionActivity.class ));
                } else if (position == 8) {
                    Uri uri = Uri.parse("market://details?id=com.gconnect.npower" );
                    Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
                    {
                        startActivity(myAppLinkToMarket);
                   /* Uri uri = Uri.parse("market://details?id=com.gconnect.npower" + getPackageName());
                    Intent goToMarket = new Intent("android.intent.ACTION_VIEW", uri);
                    // To count with Play market backstack, After pressing back button,
                    // to taken back to our application, we need to add following flags to intent.
                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=com.gconnect.npower" + getPackageName())));*/
                    }
                }else if (position == 9) {
                    new AlertDialog.Builder(HomeActivity.this).setTitle("Exit!").setMessage
                            ("Are you sure you want to close?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            HomeActivity.this.finish();
                        }
                    }).setNegativeButton("No", null).show();
                }

            }

        });

    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            new AlertDialog.Builder(this).setTitle("Exit!").setMessage
                    ("Are you sure you want to close?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                   HomeActivity.this.finish();
                }
            }).setNegativeButton("No", null).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        }
         return super.onOptionsItemSelected(item);
            }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the home action
            startActivity(new Intent(this, HomeActivity.class));
        } else if (id == R.id.nav_contact_us) {
            // Handle the npower apply now acti
            startActivity(new Intent(this, ContactActivity.class));
        } else if (id == R.id.nav_apply_now) {
            // Handle the npower apply now acti
            startActivity(new Intent(this, AboutActivity.class));

        } else if (id == R.id.nav_rate_us) {
            // Handle the rate us Activity
            Uri uri = Uri.parse("market://details?id=com.gconnect.npower" );
            Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
             {
                startActivity(myAppLinkToMarket);
            }/*catch (ActivityNotFoundException e) {
                Toast.makeText(HomeActivity.this, "unable to find market app", Toast.LENGTH_LONG).show();
            }*/
/*
            Uri uri;
            Intent rate = new Intent(Intent.ACTION_VIEW, uri);
           rate.setData(Uri.parse("market://details?id=com.gconnect.npower"));
            startActivity(rate);
*/

        } else if (id == R.id.nav_share) {
            //handles the share action
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "GconnectHub" + " \nCheck out this Npower Past Questions, " +
                    "\nhttps://play.google.com/store/apps/details?id=com.gconnect.npower ");
            startActivity(Intent.createChooser(shareIntent, "From Gconnect"
            ));


        } else if (id == R.id.nav_Feedback) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:gconnectng@gmail.com"));//only email
            intent.putExtra(Intent.EXTRA_SUBJECT, "");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

            } else if (id == R.id.nav_policy) {
            // Handle the  privacy policy action
            startActivity(new Intent(this, PrivacyActivity.class));

            } else if (id == R.id.nav_exit) {
                //handles the exit action
                new AlertDialog.Builder(HomeActivity.this).setTitle("Exit!").setMessage
                        ("Are you sure you want to close?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        HomeActivity.this.finish();
                    }
                }).setNegativeButton("No", null).show();

            }


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }



}

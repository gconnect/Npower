package com.gconnect.npower.NpowerHealth;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.gconnect.npower.Controller.HomeActivity;
import com.gconnect.npower.Health1Activity;
import com.gconnect.npower.Healthpart2Activity;
import com.gconnect.npower.Part1healthAnswerActivity;
import com.gconnect.npower.Part2healthAnswerActivity;
import com.gconnect.npower.R;

public class NpowerHealthActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npower_health);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "GconnectHub" +  " \nCheck out this Npower Past Questions, " +
                        "\nhttps://play.google.com/store/apps/details?id=com.gconnect.npower ");
                startActivity(Intent.createChooser(shareIntent, "From Gconnect"
                ));
            }
        });

    }

    public void start (View view){
        Intent i = new Intent (NpowerHealthActivity.this, Health1Activity.class);
        startActivity(i);
    }
    public void viewanswer (View view){
        Intent i = new Intent (NpowerHealthActivity.this, Part1healthAnswerActivity.class);
        startActivity(i);
    }


 public void h22start (View view){
        Intent i = new Intent (NpowerHealthActivity.this, Healthpart2Activity.class);
        startActivity(i);
    }



    public void viewanswer2 (View view){
        Intent i = new Intent (NpowerHealthActivity.this, Part2healthAnswerActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_npower_health, menu);
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
            startActivity(new Intent(this, HomeActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.npower_part1_health_question, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.tquestion1);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    NpowerPart1HealthQuestion healthQuestion1= new NpowerPart1HealthQuestion();
                    return healthQuestion1;
                case 1:
                    NpowerPart1HealthAnswer healthAnswer1= new NpowerPart1HealthAnswer();
                    return healthAnswer1;
                case 2:
                    NpowerPart2HealthQuestion healthQuestion2= new NpowerPart2HealthQuestion();
                    return healthQuestion2;
                case 3:
                    NpowerPart2HealthAnswer healthAnswer2= new NpowerPart2HealthAnswer();
                    return healthAnswer2;
            }

            return null;
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            //return PlaceholderFragment.newInstance(position + a);
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Health Question part1";
                case 1:
                    return "Health Answer part1";
                case 2:
                    return "Health Question part2";
                case 3:
                    return "Health answer part2";
            }
            return null;
        }
    }
}

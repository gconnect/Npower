package com.gconnect.npower;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;

/**
 * Created by gconnect on 17/07/2017.
 */

public class NpowerLikelyQuestions extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView =inflater.inflate(R.layout.npower_likely_question, container, false);
        return rootView;
    }
}

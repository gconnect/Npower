package com.gconnect.npower.CommunityEducation;

/**
 * Created by gconnect on 05/07/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gconnect.npower.R;

public class CommunityEducationQuestion extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView =inflater.inflate(R.layout.community_education_question, container, false);
        return rootView;
    }


}

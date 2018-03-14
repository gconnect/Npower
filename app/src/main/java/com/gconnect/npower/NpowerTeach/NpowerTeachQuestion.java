package com.gconnect.npower.NpowerTeach;

/**
 * Created by gconnect on 05/07/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


import com.gconnect.npower.R;
import com.gconnect.npower.TeachActivity;

public class NpowerTeachQuestion extends Fragment {
Button start;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.npower_teach_question, container, false);
        return rootView;


//        Button start =  findViewById(R.id.start);
//        start.setOnClickListener();


    }


}
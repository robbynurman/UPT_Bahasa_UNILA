package com.ta.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by Kuncoro on 22/03/2016.
 */
public class Level2 extends Fragment {

    public Level2(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.level2, container, false);

        getActivity().setTitle("TOEFEL Level 2");

        return view;
    }
}

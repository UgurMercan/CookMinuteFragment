package com.example.ugur.cookminute_navigation.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.ugur.cookminute_navigation.R;

/**
 * Created by Ugur on 30/10/2015.
 */
public class FragmentAcceuil extends android.support.v4.app.Fragment {


    LinearLayout accueil;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        accueil = (LinearLayout) inflater.inflate(R.layout.b_accueil_layout, null);

        setCircleDesign();

        return accueil;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("", "Tesssssst");

    }

    public void setCircleDesign(){

        LinearLayout circleView  = (LinearLayout) accueil.findViewById(R.id.circle);
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int widthScreen = metrics.widthPixels;
        circleView.setLayoutParams(new LinearLayout.LayoutParams(widthScreen/2, widthScreen/2));
    }
}
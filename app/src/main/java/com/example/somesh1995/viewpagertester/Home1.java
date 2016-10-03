package com.example.somesh1995.viewpagertester;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Home1 extends Fragment {
    Button aboutusbutton;
    public Home1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.fragment_home1, container, false);//16.75,38.25,26.5

        aboutusbutton=(Button)rootView.findViewById(R.id.aboutusbutton);
        aboutusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),AboutUsActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}

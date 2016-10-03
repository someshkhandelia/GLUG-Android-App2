package com.example.somesh1995.viewpagertester;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home4 extends Fragment {


    Button contactusbutton;
    public Home4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.fragment_home4, container, false);//16.75,38.25,26.5

        contactusbutton=(Button)rootView.findViewById(R.id.contactusbutton);
        contactusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ContactUsActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}

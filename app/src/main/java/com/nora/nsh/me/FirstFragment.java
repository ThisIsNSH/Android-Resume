package com.nora.nsh.me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class FirstFragment extends Fragment {
    // Store instance variables
    private String title;
    private int page;
    int count=0,count1=0,count2=0,count3=0;

    // newInstance constructor for creating fragment with arguments
    public static FirstFragment newInstance(int page, String title) {
        FirstFragment fragmentFirst = new FirstFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }


    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_first_fragment, container, false);



        final View surface1 = view.findViewById(R.id.surface1);
        final View surface2 = view.findViewById(R.id.surface2);
        final View surface3 = view.findViewById(R.id.surface3);
        final View surface4 = view.findViewById(R.id.surface4);

        Animation adone1 = AnimationUtils.loadAnimation(this.getActivity(), R.anim.translate1);
        Animation adone2 = AnimationUtils.loadAnimation(this.getActivity(), R.anim.translate);
        adone1.setDuration(1100);
        adone2.setDuration(1100);



        surface1.startAnimation(adone2);
        surface2.startAnimation(adone2);
        surface3.startAnimation(adone2);
        surface4.startAnimation(adone2);

        surface1.postDelayed(new Runnable() {
            public void run() {
                surface1.setVisibility(View.VISIBLE);
            }
        }, 0);
        surface2.postDelayed(new Runnable() {
            public void run() {
                surface2.setVisibility(View.VISIBLE);
            }
        }, 0);
        surface3.postDelayed(new Runnable() {
            public void run() {
                surface3.setVisibility(View.VISIBLE);
            }
        }, 0);
        surface4.postDelayed(new Runnable() {
            public void run() {
                surface4.setVisibility(View.VISIBLE);
            }
        }, 0);


        surface1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                TextView text = (TextView) getView().findViewById(R.id.education);
                if(count==0)
                {text.setText("~srn international\n  school, jaipur\n~blue bells public\n  school, gurgaon");
                text.setTextSize(25);
                 count = 1;}
                else
                {text.setText("education");
                    text.setTextSize(45);
                    count = 0;

                }


            }});
        surface2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                TextView text = (TextView) getView().findViewById(R.id.contact);
                if(count1==0)
                {text.setText("~mobile-9560705734\n~gmail-hadanis.singh");
                    text.setTextSize(25);
                    count1 = 1;}
                else
                {text.setText("contact");
                    text.setTextSize(45);
                    count1 = 0;

                }
            }});
        surface3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                TextView text = (TextView) getView().findViewById(R.id.qualities);
                if(count2==0)
                {text.setText("~multitalented\n~sincere\n~critical thinker\n~leader");
                    text.setTextSize(25);
                    count2 = 1;}
                else
                {text.setText("qualities");
                    text.setTextSize(45);
                    count2 = 0;

                }
            }});
        surface4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                TextView text = (TextView) getView().findViewById(R.id.likes);
                if(count3==0)
                {text.setText("~graphic designing\n~coding\n~fifa mobile\n~ultralife");
                    text.setTextSize(25);
                    count3 = 1;}
                else
                {text.setText("likes");
                    text.setTextSize(45);
                    count3 = 0;

                }
            }});



        super.onCreate(savedInstanceState);
        return view;



    }


}




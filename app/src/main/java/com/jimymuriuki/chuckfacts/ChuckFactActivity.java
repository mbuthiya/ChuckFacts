package com.jimymuriuki.chuckfacts;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ChuckFactActivity extends AppCompatActivity implements View.OnClickListener {
    private Resources resources;
    private String[] chuckFacts;
    private int[] backgroundColors;


    //define the views
    @Bind(R.id.tv_chuck_fact_title)TextView chuckFactTitle;
    @Bind(R.id.tv_chuck_fact)TextView chuckFact;
    @Bind(R.id.btn_changeFact)Button changeFact;
    @Bind(R.id.linearLayout)LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuck_fact);
        ButterKnife.bind(this);

        resources=getResources();
        //getting the array from the resources
        chuckFacts=resources.getStringArray(R.array.chuck_jokes_array);
        backgroundColors=resources.getIntArray(R.array.background_colors);

        //getting random fact
        String randomFact=RandomGenerator.getRandomFact(chuckFacts);
        //int color=
        int backgroundColor=RandomGenerator.getRandomColor(backgroundColors);

        linearLayout.setBackgroundColor(backgroundColor);
        changeFact.setBackgroundColor(backgroundColor);
        chuckFact.setText(randomFact);



        changeFact.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        String randomFact=RandomGenerator.getRandomFact(chuckFacts);
        int backgroundColor=RandomGenerator.getRandomColor(backgroundColors);
        linearLayout.setBackgroundColor(backgroundColor);
        changeFact.setBackgroundColor(backgroundColor);
        chuckFact.setText(randomFact);

    }
}

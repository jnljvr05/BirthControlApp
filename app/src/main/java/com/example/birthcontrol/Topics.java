package com.example.birthcontrol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Topics extends AppCompatActivity {

    private ConstraintLayout whatBtn;
    private ConstraintLayout methodBtn;
    private ConstraintLayout benefitBtn;
    private ConstraintLayout diseasesBtn;
    private ConstraintLayout symptomsBtn;
    private LinearLayout backBtn;

    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);

        drawerLayout = findViewById(R.id.drawer_layout);

        whatBtn = findViewById(R.id.whatBtn);
        methodBtn = findViewById(R.id.methodBtn);
        benefitBtn =findViewById(R.id.benefitBtn);
        diseasesBtn = findViewById(R.id.diseasesBtn);
        symptomsBtn = findViewById(R.id.symptomsBtn);

        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Topics.this, MainActivity.class));
            }
        });

        whatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Topics.this, What.class));
            }
        });

        methodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Topics.this, Methods.class));
            }
        });

        benefitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Topics.this, Benefits.class));
            }
        });

        diseasesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Topics.this, Diseases.class));
            }
        });

        symptomsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Topics.this, Symptoms.class));
            }
        });

    }
}
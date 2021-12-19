package com.example.cyber.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cyber.R;

public class homeActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Button exitButton = findViewById(R.id.exit_btn);
        final Button shareButton = findViewById(R.id.share_btn);
        final Button resultButton = findViewById(R.id.result_btn);
        final Button contactButton = findViewById(R.id.contact_btn);
        final Button resourcesButton = findViewById(R.id.resources_btn);
        final Button surveyButton = findViewById(R.id.survey_btn);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0); //This should close the app
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homeActivity.this, ShareActivity.class));
            }
        });

        surveyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homeActivity.this, surveyActivity.class));
            }
        });
        resourcesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homeActivity.this, ResourceActivity.class));
            }
        });
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homeActivity.this, ResultActivity.class));
            }
        });
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homeActivity.this, ContactActivity.class));
            }
        });
    }
}

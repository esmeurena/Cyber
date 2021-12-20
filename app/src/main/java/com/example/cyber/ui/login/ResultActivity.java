package com.example.cyber.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cyber.R;

public class ResultActivity extends AppCompatActivity {

    TextView received_score;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        received_score = (TextView) findViewById(R.id.score);
        Intent intent = getIntent();
        int int_score = intent.getIntExtra("score_total",0);
        String string_score = String.valueOf(int_score);

        Log.d("int_score", ""+ int_score);
        Log.d("string_score", ""+ string_score);
        Log.d("received_score", ""+ received_score);
        received_score.setText(string_score);


        final Button returnHomeButton = findViewById(R.id.back_home);

        returnHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, homeActivity.class));// HomeActivity.class));
            }
        });
    }
}

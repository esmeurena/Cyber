package com.example.cyber.ui.login;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cyber.R;
import com.example.cyber.ui.login.LoginViewModel;
import com.example.cyber.ui.login.LoginViewModelFactory;

import java.util.ArrayList;

public class surveyActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;
    public int score_total = 0;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    public static final String SWITCH1 = "switch1";

    ArrayList<EditText> answers = new ArrayList<EditText>();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_survey);
        final Button resultButton = findViewById(R.id.go_results);

        Spinner spinner = (Spinner) findViewById(R.id.q1_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.answers_question1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString(); //this is your selected item
                Log.d("tag", "DOES IT FINALLY FKN WORK??? "+ selectedItem);

                if(selectedItem.contains("zero"))
                {score_total += 20;}
                else if(selectedItem.contains("one"))
                {score_total += 15;}
                else if(selectedItem.contains("two"))
                {score_total += 10;}
                else if(selectedItem.contains("three"))
                {score_total += 5;}
                else if(selectedItem.contains("four"))
                {score_total += 0;}

                Log.d("SCORE_TOTAL", "FINALLY THE FINAL SCORE: " + score_total);

            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        Spinner spinner2 = (Spinner) findViewById(R.id.q2_spinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.answers_question1, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString(); //this is your selected item
                Log.d("tag", "DOES IT FINALLY FKN WORK??? "+ selectedItem);

                if(selectedItem.contains("zero"))
                {score_total += 20;}
                else if(selectedItem.contains("one"))
                {score_total += 15;}
                else if(selectedItem.contains("two"))
                {score_total += 10;}
                else if(selectedItem.contains("three"))
                {score_total += 5;}
                else if(selectedItem.contains("four"))
                {score_total += 0;}

                Log.d("SCORE_TOTAL", "FINALLY THE FINAL SCORE: " + score_total);

            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        Spinner spinner3 = (Spinner) findViewById(R.id.q3_spinner);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.answers_question1, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString(); //this is your selected item
                Log.d("tag", "DOES IT FINALLY FKN WORK??? "+ selectedItem);

                if(selectedItem.contains("zero"))
                {score_total += 20;}
                else if(selectedItem.contains("one"))
                {score_total += 15;}
                else if(selectedItem.contains("two"))
                {score_total += 10;}
                else if(selectedItem.contains("three"))
                {score_total += 5;}
                else if(selectedItem.contains("four"))
                {score_total += 0;}

                Log.d("SCORE_TOTAL", "FINALLY THE FINAL SCORE: " + score_total);

            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        Spinner spinner4 = (Spinner) findViewById(R.id.q4_spinner);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.answers_question1, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString(); //this is your selected item
                Log.d("tag", "DOES IT FINALLY FKN WORK??? "+ selectedItem);

                if(selectedItem.contains("zero"))
                {score_total += 20;}
                else if(selectedItem.contains("one"))
                {score_total += 15;}
                else if(selectedItem.contains("two"))
                {score_total += 10;}
                else if(selectedItem.contains("three"))
                {score_total += 5;}
                else if(selectedItem.contains("four"))
                {score_total += 0;}

                Log.d("SCORE_TOTAL", "FINALLY THE FINAL SCORE: " + score_total);

            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        Spinner spinner5 = (Spinner) findViewById(R.id.q5_spinner);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.answers_question1, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString(); //this is your selected item
                Log.d("tag", "DOES IT FINALLY FKN WORK??? "+ selectedItem);

                if(selectedItem.contains("zero"))
                {score_total += 20;}
                else if(selectedItem.contains("one"))
                {score_total += 15;}
                else if(selectedItem.contains("two"))
                {score_total += 10;}
                else if(selectedItem.contains("three"))
                {score_total += 5;}
                else if(selectedItem.contains("four"))
                {score_total += 0;}

                Log.d("SCORE_TOTAL", "FINALLY THE FINAL SCORE: " + score_total);

            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        Log.d("SCORE_TOTAL", "FINALLY THE FINAL SCORE: " + score_total);

        resultButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                /*
                loadingProgressBar.setVisibility(View.VISIBLE);
                loginViewModel.login(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
                */
                if(score_total >= 90)
                {startActivity(new Intent(surveyActivity.this, ResultActivity.class));}
                else
                {Log.d("tag", "i suck at security");}
            }

        });

    }
/*
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id)
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("q1_answer", parent.getItemAtPosition(pos).toString());

        if(parent.getItemAtPosition(pos).toString() == "none")
        {
            editor.putInt("score", score_total+10);
        }
    }*/
}
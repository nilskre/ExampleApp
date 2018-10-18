package com.example.android.exampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String INPUT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final TextView textViewInMainActivity = (TextView)findViewById(R.id.textView);

        Button myButton = (Button)findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked();
            }
        });
    }

    private void buttonClicked() {
        EditText myEditText = (EditText)findViewById(R.id.editText);
        INPUT = myEditText.getText().toString();
        Intent intentToShowSecondActivity = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intentToShowSecondActivity);
        //textViewInMainActivity.setText(input);
    }
}

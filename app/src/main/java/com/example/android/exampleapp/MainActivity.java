package com.example.android.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView)findViewById(R.id.textView);
        myTextView.setText("Test");

        EditText myEditText = (EditText)findViewById(R.id.editText);
        String input = myEditText.getText().toString();
    }
}

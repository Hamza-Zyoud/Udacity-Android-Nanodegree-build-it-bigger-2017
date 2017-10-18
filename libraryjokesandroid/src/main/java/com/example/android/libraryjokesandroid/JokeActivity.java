package com.example.android.libraryjokesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    private static final String INTENT_EXTRA="INTENT_JOKE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeText=(TextView)findViewById(R.id.joke_text);
        String joke=getIntent().getStringExtra(INTENT_EXTRA);


        if (jokeText != null) {
            jokeText.setText(joke);
        } else {
            jokeText.setText("Dig deeped, something wrong is going on!");
        }

    }
}

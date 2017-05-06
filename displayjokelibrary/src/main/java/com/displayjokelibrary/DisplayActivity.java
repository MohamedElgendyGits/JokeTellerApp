package com.displayjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    public static final String INTENT_JOKE_KEY = "intent_joke_key";
    TextView displayJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        displayJokeTextView = (TextView) findViewById(R.id.textView_joke);

        if(getIntent().getExtras() != null){
            String passedJoke = getIntent().getStringExtra(INTENT_JOKE_KEY);
            displayJokeTextView.setText(passedJoke);
        }
    }
}

package com.thoughtworks.firstapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.thoughtworks.firstapp.BuildConfig;
import com.thoughtworks.firstapp.R;
import com.thoughtworks.firstapp.ui.tweetlist.TweetListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_second);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSecondActivity();
            }
        });

        findViewById(R.id.btn_tweetlist).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchTweetListActivity();
            }
        });

        System.err.println("This is an error");
        if (BuildConfig.DEBUG) {
            Log.e("FirstApp", "This is an error");
        }
    }

    private void launchTweetListActivity() {
        Intent intent = new Intent(this, TweetListActivity.class);
        startActivity(intent);
    }

    private void launchSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}

package com.example.android.getrightapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getName();
    //private final Context CONTEXT = getApplicationContext();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout mindLayout = (FrameLayout) findViewById(R.id.mind);
        FrameLayout bodyLayout = (FrameLayout) findViewById(R.id.body);
        FrameLayout soulLayout = (FrameLayout) findViewById(R.id.soul);

        mindLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"MIND", Toast.LENGTH_SHORT)
                .show();
            }
        });

        bodyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"BODY", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        soulLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"SOUL", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}

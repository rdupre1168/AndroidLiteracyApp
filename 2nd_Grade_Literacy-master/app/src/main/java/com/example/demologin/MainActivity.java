package com.example.demologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loadVows(View v) {
       Intent intent = new Intent(this, VowsActivity.class);
       startActivity(intent);
    }

    public void loadCons(View v) {
        Intent intent = new Intent(this, ConsActivity.class);
        startActivity(intent);
    }

}
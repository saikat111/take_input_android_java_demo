package com.s.takeinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    private TextView getnameformain;
    String getData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        getnameformain = findViewById(R.id.getnameformain);
        getData = getIntent().getStringExtra("name");
        getnameformain.setText(getData);

    }
}
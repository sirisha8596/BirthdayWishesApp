package com.siri.birthdaywishesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class Second extends AppCompatActivity {
    TextView t;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t=findViewById(R.id.name);
        s=getIntent().getExtras().getString("value");
        t.setText(s);
    }
}

package com.siri.birthdaywishesapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private Button b;
    private EditText e;
    String n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.bwish);
        e = findViewById(R.id.etext);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGreeting();
            }
        });
    }


    public void openGreeting(){
        n=e.getText().toString();
        if(n.isEmpty())
        {
            Toast.makeText(this, "Please Enter Name", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(this, Second.class);
            intent.putExtra("value", n);
            startActivity(intent);
            finish();
        }
    }
}

        








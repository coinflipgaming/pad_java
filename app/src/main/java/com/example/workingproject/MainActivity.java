package com.example.workingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            String[] categories ={"jabłko","pomarańcza","gruszka","mango","porzeczka"};
            LinearLayout a = findViewById(R.id.main_container);
            for(int x = 0; x < 5; x++){
                CheckBox checkBox1 = new CheckBox(getApplicationContext());
                CheckBox checkBox2 = new CheckBox(getApplicationContext());
                TextView textview1 = new TextView(getApplicationContext());
                textview1.setText(categories[x]);

                LinearLayout b = new LinearLayout(getApplicationContext());
                b.setOrientation(LinearLayout.HORIZONTAL);

                b.addView(checkBox1);
                b.addView(checkBox2);
                b.addView(textview1);

                a.addView(b);
            }

        }catch (Error e){
            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();
        }

    }




}
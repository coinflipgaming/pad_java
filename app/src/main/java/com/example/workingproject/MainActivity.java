package com.example.workingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
            String[] categories ={"jabłko","pomarańcza","gruszka","mango","porzeczka","ananas"};
            LinearLayout a = findViewById(R.id.main_container);
            for (String category : categories) {
                CheckBox checkBox1 = new CheckBox(getApplicationContext());
                CheckBox checkBox2 = new CheckBox(getApplicationContext());
                TextView textview1 = new TextView(getApplicationContext());
                textview1.setText(category);

                checkBox1.setOnClickListener(view -> checkBox2.setChecked(false));
                checkBox2.setOnClickListener(view -> checkBox1.setChecked(false));

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
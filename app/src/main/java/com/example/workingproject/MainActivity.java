package com.example.workingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String categories[]={"jabłko","pomarańcza","gruszka","mango","porzeczka"};
    LinearLayout a = new LinearLayout(this.getApplicationContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        for(int x = 0; x < categories.length; x++){
            CheckBox checkBox1 = new CheckBox(getApplicationContext());
            CheckBox checkBox2 = new CheckBox(getApplicationContext());
            TextView txtview1 = new TextView(getApplicationContext());
            txtview1.setText(categories[x]);

            LinearLayout b = new LinearLayout(getApplicationContext());
            b.setOrientation(LinearLayout.VERTICAL);

            b.addView(checkBox1);
            b.addView(checkBox2);
            b.addView(txtview1);

            a.addView(b);
        }

        setContentView(R.layout.activity_main);
    }




}
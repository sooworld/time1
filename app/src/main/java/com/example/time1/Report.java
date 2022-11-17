package com.example.time1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

public class Report extends AppCompatActivity {
    TextView year2, mon2,day2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        //변수
        ImageButton btn3 = (ImageButton) findViewById(R.id.btn3);
        year2 = findViewById(R.id.year2);
        mon2 = findViewById(R.id.mon2);
        day2 = findViewById(R.id.date2);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }


    public void processDatePickerResult2(int year, int month, int day) {

        String year_string = Integer.toString(year);
        String month_string = Integer.toString(month);
        String day_string = Integer.toString(day);

        //setText에는 문자형으로 넣어줘야 오류가 안생김
        year2.setText(year_string);
        mon2.setText(month_string);
        day2.setText(day_string);

    }

}
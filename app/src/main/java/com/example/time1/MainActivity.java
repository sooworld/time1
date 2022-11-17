package com.example.time1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    TextView year1, mon1,day1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //변수
    BottomNavigationView bottomNavigationView;
    Fragment fragment1;
    ImageButton btn1 = (ImageButton) findViewById(R.id.btn1);
    Button btn2 = (Button) findViewById(R.id.btn2);
    year1 = findViewById(R.id.year1);
    mon1 = findViewById(R.id.mon1);
    day1 = findViewById(R.id.date1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Report.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Write.class);
                startActivity(intent);
            }
        });
        }
        public void callDateDialog(View view){
            DialogFragment dateFragment = new DatePickerFragment();
            dateFragment.show(getSupportFragmentManager(),"dateFragment");

        }

      public void processDatePickerResult(int year, int month, int day) {

          String year_string = Integer.toString(year);
          String month_string = Integer.toString(month);
          String day_string = Integer.toString(day);

          //setText에는 문자형으로 넣어줘야 오류가 안생김
        year1.setText(year_string);
        mon1.setText(month_string);
        day1.setText(day_string);

    }


}
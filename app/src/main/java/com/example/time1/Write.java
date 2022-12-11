package com.example.time1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class Write extends AppCompatActivity {
        private ListView listview;
        private ListViewAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_write_detail);

        //adapter 생성\
            adapter = new ListViewAdapter();
        //리스트뷰 참조 및 adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);
        //listview.setOnItemClickListener(listener);

        adapter.addItem("닉네임1","메뉴자리1", "댓글1");
        adapter.addItem("닉네임2","메뉴자리2", "댓글2");
        adapter.addItem("닉네임3","메뉴자리3", "댓글3");
        adapter.addItem("닉네임4","메뉴자리4", "댓글4");
        adapter.addItem("닉네임5","메뉴자리5", "댓글5");

        adapter.notifyDataSetChanged(); //어댑터의 변경을 알림

        }
}
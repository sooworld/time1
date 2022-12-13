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
import android.widget.PopupMenu;
import android.widget.Toast;

public class Write extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_write_detail);



        //여기 메뉴
            findViewById(R.id.btnmenu).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View view) {
                    final PopupMenu popupMenu = new PopupMenu(getApplicationContext(), view);

                    getMenuInflater().inflate(R.menu.eddel, popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            if (menuItem.getItemId() == R.id.btned) {
                                Toast.makeText(Write.this, "수정을 클릭했당", Toast.LENGTH_SHORT).show();
                            } else if (menuItem.getItemId() == R.id.btndel) {
                                Toast.makeText(Write.this, "삭제를 클릭했당", Toast.LENGTH_SHORT).show();
                            }

                            return false;
                        }
                    });
                    popupMenu.show();




        //여기 댓글 리스트뷰

        //adapter 생성
        ListViewAdapter adapter = new ListViewAdapter();
        //리스트뷰 참조 및 adapter달기
        ListView listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);
        //listview.setOnItemClickListener(listener);

        adapter.addItem("닉네임1","날짜1", "댓글1");
        adapter.addItem("닉네임2","메뉴자리2", "댓글2");
        adapter.addItem("닉네임3","메뉴자리3", "댓글3");
        adapter.addItem("닉네임4","메뉴자리4", "댓글4");
        adapter.addItem("닉네임5","메뉴자리5", "댓글5");

        adapter.notifyDataSetChanged(); //어댑터의 변경을 알림
        }


});}}



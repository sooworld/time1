package com.example.time1;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    private TextView editnickname1;
    private TextView editmenu1;
    private TextView editcom1;

    //adapter에 추가된 데이터를 저장하기 위한 ArrayList

    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();

    //ListViewAdapter의 생성자
    public  ListViewAdapter(){

    }

    //Adapter에 사용되는 데이터의 개수를 리턴
    @Override
    public int getCount(){
        return listViewItemList.size();
    }

    //position에 위치한 데이터를 화면에 출력하는데 사용될 view를 리턴
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        //"activity_list_view1" layout을 inflate하여 convertView참조 획득
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }

        //화면에 표시될 view(layout이 inflate된)으로부터 위젯에 대한 참조 획득
        editnickname1 = (TextView) convertView.findViewById(R.id.editnickname);
        editmenu1 = (TextView) convertView.findViewById(R.id.editmenu);
        editcom1 = (TextView) convertView.findViewById(R.id.editcom);

        ListViewItem listViewItem = listViewItemList.get(position);

        //아이템 내 각 위젯에 데이터 반영
        editnickname1.setText(listViewItem.getEditNickname());
        editmenu1.setText(listViewItem.getEditmenu());
        editcom1.setText(listViewItem.getEditcom());

        return convertView;
    }

    //지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴
    @Override
    public long getItemId(int position){
        return position;
    }

    //지정한 위치(position)에 있는 데이터 리턴
    @Override
    public Object getItem(int position){
        return  listViewItemList.get(position);
    }

    //아이템 데이터 추가를 위한 함수
    public void addItem(String editnickname,String editmenu,String editcom){
        ListViewItem item = new ListViewItem();

        item.setEditnickname(editnickname);
        item.setEditmenu(editmenu);
        item.setEditcom(editcom);

        listViewItemList.add(item);
    }
}

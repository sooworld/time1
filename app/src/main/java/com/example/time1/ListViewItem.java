package com.example.time1;

public class ListViewItem {

    private String editnicknameStr; //리스트뷰 닉네임
    private String editmenuStr; //리스트뷰 수정 삭제 메뉴
    private String editcomStr; //리스트뷰 댓글

    public void setEditnickname(String editNickname){
        editnicknameStr = editNickname;
    }
    public void setEditmenu(String editmenu){
        editmenuStr = editmenu;
    }
    public void setEditcom(String editcom){
        editcomStr = editcom;
    }

    public String getEditNickname(){
        return this.editnicknameStr;
    }
    public String getEditmenu(){
        return this.editmenuStr;
    }
    public String getEditcom(){
        return this.editcomStr;
    }
}
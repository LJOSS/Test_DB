package com.example.test_db;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnUser;

    public static UserDB MyDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUser = (Button) findViewById(R.id.btnUser);
        btnUser.setOnClickListener(this);
        MyDB = Room.databaseBuilder(getApplicationContext(),UserDB.class,"Usersdb").allowMainThreadQueries().build();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnUser:
                Intent i = new Intent(this,User_Activity.class);
                startActivity(i);
                break;
        }
    }
}

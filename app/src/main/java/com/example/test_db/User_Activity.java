package com.example.test_db;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class User_Activity extends AppCompatActivity implements View.OnClickListener {

    Button btnAdd;
    EditText etName, etEmail, etId;
    int Id;
    String Name, Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        etEmail = findViewById(R.id.etEmail);
        etName = findViewById(R.id.etName);
        etId = findViewById(R.id.etId);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAdd:
                Id = Integer.parseInt(etId.getText().toString());
                Name = etName.getText().toString();
                Email = etEmail.getText().toString();

                User user = new User();
                user.setId(Id);
                user.setEmail(Email);
                user.setName(Name);
                MainActivity.MyDB.userDAO().AddUser(user);

                Toast.makeText(this, "Sucsess", Toast.LENGTH_SHORT).show();
                etEmail.setText("");
                etName.setText("");
                etId.setText("");
                break;
        }
    }
}

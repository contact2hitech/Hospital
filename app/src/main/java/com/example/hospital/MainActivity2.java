package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView id,name,surname,number,email,department;
    String strid,strname,strsurname,strnumber,stremail,strdepartment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        id=findViewById(R.id.id);
        name=findViewById(R.id.name);
        surname=findViewById(R.id.surname);
        number=findViewById(R.id.number);
        email=findViewById(R.id.email);
        department=findViewById(R.id.department);

        Intent i =getIntent();
        strid=i.getStringExtra("id");
        id.setText(strid);

        strname=i.getStringExtra("name");
        name.setText(strname);

        strsurname=i.getStringExtra("surname");
        surname.setText(strsurname);

        strnumber=i.getStringExtra("number");
        number.setText(strnumber);

        stremail=i.getStringExtra("email");
        email.setText(stremail);

        strdepartment=i.getStringExtra("department");
        department.setText(strdepartment);

    }
}
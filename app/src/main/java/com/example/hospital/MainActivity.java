package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    LinearLayout submit;
    EditText id,name,surname,number,email,department;
    String strid,strname,strsurname,strnumber,stremail,strdepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submit);
        id=findViewById(R.id.id);
        name=findViewById(R.id.name);
        surname=findViewById(R.id.surname);
        number=findViewById(R.id.number);
        email=findViewById(R.id.email);
        department=findViewById(R.id.department);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strid=id.getText().toString();
                strname=name.getText().toString();
                strnumber=number.getText().toString();
                strsurname=surname.getText().toString();
                stremail=email.getText().toString();
                strdepartment=department.getText().toString();

                if(strid.trim().isEmpty()){
                  id.setError("Enter Patient Id");
                  id.setBackground(getResources().getDrawable(R.drawable.red_bk));
                }
                else if (strname.trim().isEmpty()){
                    name.setBackground(getResources().getDrawable(R.drawable.red_bk));
                    name.setError("Enter Patient Name");
                }
                else if (strnumber.trim().isEmpty()){
                    number.setError("Enter Patient Number");
                    number.setBackground(getResources().getDrawable(R.drawable.red_bk));
                }
                else if (strsurname.trim().isEmpty()){
                    surname.setError("Enter Patient Surname");
                    surname.setBackground(getResources().getDrawable(R.drawable.red_bk));

                }
                else if (stremail.trim().isEmpty()){
                    email.setError("Enter Patient Email");
                    email.setBackground(getResources().getDrawable(R.drawable.red_bk));

                }  else if (strdepartment.trim().isEmpty()) {
                    department.setError("Enter Patient Department");
                    department.setBackground(getResources().getDrawable(R.drawable.red_bk));

                } else {

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("id", strid);
                    intent.putExtra("name", strname);
                    intent.putExtra("surname", strsurname);
                    intent.putExtra("email", stremail);
                    intent.putExtra("number", strnumber);
                    intent.putExtra("department", strdepartment);
                    startActivity(intent);


                }

            }
        });

        id.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                id.setBackground(getResources().getDrawable(R.drawable.edit_bk));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                name.setBackground(getResources().getDrawable(R.drawable.edit_bk));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        surname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                surname.setBackground(getResources().getDrawable(R.drawable.edit_bk));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                number.setBackground(getResources().getDrawable(R.drawable.edit_bk));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                email.setBackground(getResources().getDrawable(R.drawable.edit_bk));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        department.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                department.setBackground(getResources().getDrawable(R.drawable.edit_bk));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }

}
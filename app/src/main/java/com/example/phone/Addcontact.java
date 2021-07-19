package com.example.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Addcontact extends AppCompatActivity {
    EditText nameofperson,numberofperson;
    TextView cancel,save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcontact);
        nameofperson=findViewById(R.id.edtname);
        numberofperson=findViewById(R.id.edtphone);
        cancel=findViewById(R.id.cancel);
        save=findViewById(R.id.save);


        String namee=nameofperson.getText().toString();
        String numm=numberofperson.getText().toString();


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent=new Intent(Addcontact.this,MainActivity.class);
              startActivity(intent);
            }
        });

    }
}
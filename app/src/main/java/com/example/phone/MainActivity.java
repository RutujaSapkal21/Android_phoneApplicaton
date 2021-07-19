package com.example.phone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity{
    BottomNavigationView bottomNavigationView;
    ImageView addbtn,serachbtn,optionbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomnavigation);
        addbtn=findViewById(R.id.addbtn);
        serachbtn=findViewById(R.id.searchbtn);
        optionbtn=findViewById(R.id.moreopt);
        if (savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new keypad()).commit();
        }

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.keypad:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new keypad()).commit();
                        optionbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                PopupMenu popupMenu=new PopupMenu(MainActivity.this,optionbtn);
                                MenuInflater menuInflater=getMenuInflater();
                                menuInflater.inflate(R.menu.optionmenus,popupMenu.getMenu());

                                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                                    @Override
                                    public boolean onMenuItemClick(MenuItem item) {
                                        Toast.makeText(MainActivity.this,"You Clicked on "+item.getTitle().toString(),Toast.LENGTH_LONG).show();
                                        return true;
                                    }
                                });
                                popupMenu.show();
                            }
                        });
                        break;
                    case R.id.recents:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Recent_Fragment()).commit();
                        optionbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                PopupMenu popupMenu=new PopupMenu(MainActivity.this,optionbtn);
                                MenuInflater menuInflater=getMenuInflater();
                                menuInflater.inflate(R.menu.recentsopt,popupMenu.getMenu());

                                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                                    @Override
                                    public boolean onMenuItemClick(MenuItem item) {
                                        Toast.makeText(MainActivity.this,"You Clicked on "+item.getTitle().toString(),Toast.LENGTH_LONG).show();
                                        return true;
                                    }
                                });
                                popupMenu.show();
                            }
                        });
                        break;
                    case R.id.contacts:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Contact_fragment()).commit();
                        optionbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                PopupMenu popupMenu=new PopupMenu(MainActivity.this,optionbtn);
                                MenuInflater menuInflater=getMenuInflater();
                                menuInflater.inflate(R.menu.contactop,popupMenu.getMenu());

                                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                                    @Override
                                    public boolean onMenuItemClick(MenuItem item) {
                                        Toast.makeText(MainActivity.this,"You Clicked on "+item.getTitle().toString(),Toast.LENGTH_LONG).show();
                                        return true;
                                    }
                                });
                                popupMenu.show();
                            }
                        });
                        break;
                }
                return true;
            }
        });

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Clicked on Add",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,Addcontact.class);
                startActivity(intent);
            }
        });
        serachbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Clicked on Search",Toast.LENGTH_LONG).show();
            }
        });
  }


}
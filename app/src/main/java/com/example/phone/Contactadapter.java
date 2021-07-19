package com.example.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Contactadapter extends BaseAdapter{
    String[] Letter;
    String[] names;

    public Contactadapter(String[] letter, String[] names, String[] numberlist, Context mcontext) {
        Letter = letter;
        this.names = names;
        this.numberlist = numberlist;
        this.mcontext = mcontext;
    }

    String[] numberlist;
    Context mcontext;


    @Override
    public int getCount() {
        return Letter.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myview = null;
        if (myview==null){
            LayoutInflater layoutInflater=LayoutInflater.from(mcontext);
            myview=layoutInflater.inflate(R.layout.contactlistdesign,null);
        }
        else {
            myview = convertView;
        }
        TextView textView=myview.findViewById(R.id.text);
        TextView textView1=myview.findViewById(R.id.nam);
        textView.setText(Letter[position]);
        textView1.setText(names[position]);
       textView1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Details details=new Details();
               details.setNameofperson(names[position]);
               details.setNumber(numberlist[position]);
               details.setSamenumber(numberlist[position]);

               Intent intent=new Intent(mcontext,ViewDeatils.class);
               Bundle bundle=new Bundle();
               bundle.putSerializable("Details",details);
               intent.putExtras(bundle);
               mcontext.startActivity(intent);
           }
       });
        return myview;
    }
}

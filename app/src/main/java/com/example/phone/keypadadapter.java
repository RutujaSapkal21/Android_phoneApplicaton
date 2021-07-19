package com.example.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class keypadadapter extends BaseAdapter {
    String[] numberes;
    Context context;
    public keypadadapter(Context context,String[] numberes) {
        this.context=context;
        this.numberes = numberes;
    }



    @Override
    public int getCount() {
        return numberes.length;
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
            LayoutInflater layoutInflater=LayoutInflater.from(context);
            myview=layoutInflater.inflate(R.layout.dialpad,null);
        }
        else {
            myview = convertView;
        }
        TextView textView=myview.findViewById(R.id.numm);
        textView.setText(numberes[position]);
        return myview;
    }
}

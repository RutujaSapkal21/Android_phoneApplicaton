package com.example.phone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class keypad extends Fragment {
    GridView gridView;
    String[] num={"1","2","3","4","5","6","7","8","9","*","0","#"};
    EditText editText;
    keypadadapter keypadadap;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview= inflater.inflate(R.layout.keypad,container,false);
        gridView=myview.findViewById(R.id.gridview);
        keypadadap=new keypadadapter(getContext(),num);
        gridView.setAdapter(keypadadap);
        editText=myview.findViewById(R.id.editText);
        return myview;
    }

}

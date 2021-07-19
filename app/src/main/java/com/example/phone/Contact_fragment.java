package com.example.phone;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Contact_fragment extends Fragment {
    ListView listView;
    Contactadapter contactadapter;
    String[] Letter={"A","A","A","B","B","D","G","H","H","K","K","N","P","P","R","S","S","S","Y"};
   String[] namees={"Aai","Abhi Bro","Aunty","Bestie","Bro","Di","Guddi","Harshada","Home","Kanika","Komal","Niku","Pooja","Pragati","Ravi","Sahil","Sakshi","Sanika","Yogita"};
    String[] numberslist={"132343352","254151212","32131312","324342344","3435345345","3425454323","1231243243","235245342","312356454","563456843","3244343434"
            ,"453534556","4253645762","3434225432432","54254354254","562346223",
            "232434344","3445433","234565622","126456354"};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview=inflater.inflate(R.layout.contact_fragment,container,false);
        listView=myview.findViewById(R.id.listvieww);
        contactadapter=new Contactadapter(Letter,namees,numberslist,getContext());
        listView.setAdapter(contactadapter);
        return myview;
    }

}

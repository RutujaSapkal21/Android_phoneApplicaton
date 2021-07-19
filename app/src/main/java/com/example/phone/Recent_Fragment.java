package com.example.phone;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Recent_Fragment extends Fragment {
    ListView listView;

    String[] Letter={"S","S","K","A","B","N","B","S","S","S","K","A","B","N","B","S"};
    String[] namees={"Sakshi","Sahil","Kanika","Aai","Bro","Niku","Bestie","Sanika",
            "Sakshi","Sahil","Kanika","Aai","Bro","Niku","Bestie","Sanika"};
    int[] inout={R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_made_24,
            R.drawable.ic_baseline_call_missed_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_received_24
    ,R.drawable.ic_baseline_call_missed_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_received_24,
            R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_made_24,
            R.drawable.ic_baseline_call_missed_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_received_24
            ,R.drawable.ic_baseline_call_missed_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_made_24};

    String[] timeing={"05:10pm","01:00pm","10:45am","08:00am","Yesterday","Yesterday","Yesterday","16 July 2021","16 July 2021"
            ,"16 July 2021","16 July 2021","16 July 2021","15 July 2021","15 July 2021","15 July 2021","15 July 2021"};
    String[] mode={"mobile","mobile","mobile","mobile","mobile","mobile","mobile","mobile","mobile",
            "mobile","mobile","mobile","mobile","mobile","mobile","mobile"};
    String[] numberslist={"132343352","324342344","3435345345","563456843","453534556","232434344","3445433","234565622",
            "132343352","324342344","3435345345","563456843","453534556","232434344","3445433","234565622"};
    LogAdapter logAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.recents_fragment,container,false);
        listView=view.findViewById(R.id.listview);
        logAdapter=new LogAdapter(getContext(),Letter,namees,inout,mode,timeing,numberslist);
        listView.setAdapter(logAdapter);

        return view;
    }


}
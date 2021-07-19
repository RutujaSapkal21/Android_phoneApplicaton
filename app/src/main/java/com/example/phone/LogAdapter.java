package com.example.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LogAdapter extends BaseAdapter {
    Context mContext;

    String[] Letter;
    String[] names;
    int[] inout;
    String[] mode;
    String[] time;
    String[] numberlist;
    public LogAdapter(Context mContext, String[] letter, String[] names, int[] inout, String[] mode, String[] time, String[] numberlist) {
        this.mContext = mContext;
        Letter = letter;
        this.names = names;
        this.inout = inout;
        this.mode = mode;
        this.time = time;
        this.numberlist=numberlist;

    }



    @Override
    public int getCount() {
        return (Letter.length);
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
            LayoutInflater layoutInflater=LayoutInflater.from(mContext);
            myview=layoutInflater.inflate(R.layout.customdesignrecents,null);
        }
        else {
            myview = convertView;
        }


            TextView textView = myview.findViewById(R.id.text1);
            TextView textView1 = myview.findViewById(R.id.name1);
            ImageView imageView = myview.findViewById(R.id.inoutt1);
            TextView textView2 = myview.findViewById(R.id.modee1);
            TextView textView3 = myview.findViewById(R.id.timee1);


            textView.setText(Letter[position]);
            textView1.setText(names[position]);
            imageView.setImageResource(inout[position]);
            textView2.setText(mode[position]);
            textView3.setText(time[position]);


            textView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Details details = new Details();
                    details.setNameofperson(names[position]);
                    details.setNumber(numberlist[position]);
                    details.setSamenumber(numberlist[position]);

                    Intent intent = new Intent(mContext, ViewDeatils.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("Details", details);
                    intent.putExtras(bundle);
                    mContext.startActivity(intent);
                }
            });

        return myview;
    }
}

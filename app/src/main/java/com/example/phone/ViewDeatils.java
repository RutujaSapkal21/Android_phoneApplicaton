package com.example.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ViewDeatils extends AppCompatActivity {
    ImageView backarrow,optionmenus,camera,call,msg,videocall,edit;
    TextView nameofperson,number,samenumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_deatils);
        backarrow=findViewById(R.id.back);
        optionmenus=findViewById(R.id.optionmenu);
        camera=findViewById(R.id.cameraa);
        call=findViewById(R.id.callsymbol);
        msg=findViewById(R.id.msgoption);
        videocall=findViewById(R.id.videocall);
        edit=findViewById(R.id.editt);

        nameofperson=findViewById(R.id.nameofperson);
        number=findViewById(R.id.numbers);
        samenumber=findViewById(R.id.mobilesame);

        Details details=(Details)getIntent().getSerializableExtra("Details");

        String myname=details.getNameofperson();
        String mynum=details.getNumber();
        String samenum=details.getSamenumber();

        nameofperson.setText(myname);
        number.setText(mynum);
        samenumber.setText(samenum);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calling=new Intent(Intent.ACTION_CALL);
                calling.setData(Uri.parse("tel:"+details.getNumber()));
                startActivity(calling);
                Toast.makeText(ViewDeatils.this,"You Clicked on "+ details.getNumber(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
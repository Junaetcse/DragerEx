package com.bangladesh.user.dragerex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nex3z.notificationbadge.NotificationBadge;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {
NotificationBadge notificationBadge;
int count=0;
int[] aaa  ={10,20,30,111,55,142};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationBadge=findViewById(R.id.bedge);
        Button butIncrease=findViewById(R.id.incrise);
        butIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationBadge.setNumber(++count);
            }
        });

        Button butMany=findViewById(R.id.many);
        Button clear=findViewById(R.id.clear);

        butMany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationBadge.setNumber(aaa.length);

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationBadge.setNumber(0);
            }
        });






    }
}

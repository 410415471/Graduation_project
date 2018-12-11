package com.example.user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    public static int level=0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1= findViewById(R.id.button2);
        btn2= findViewById(R.id.button3);
        btn3= findViewById(R.id.button4);
        btn1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                level=1;
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                level=2;
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                level=3;
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
    }
}


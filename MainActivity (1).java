package com.example.chatbotapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ScrollView;


public class MainActivity extends AppCompatActivity {

    private EditText FirstName;
    private EditText LastName;
    private TextView alicequote;
    private ImageView Aliceimg;
    private Button Loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final ScrollView scrollview = (ScrollView) findViewById(R.id.scroll) ;
//        scrollview.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//                scrollview.post(new Runnable() {
//                    public void run() {
//                        scrollview.fullScroll(View.FOCUS_DOWN);
//                    }
//                });
//            }
//        });
        View view;
        view=this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.Gray);

        FirstName=(EditText)findViewById(R.id.etfirstname);
        LastName=(EditText)findViewById(R.id.etsecondname);
        alicequote=(TextView)findViewById(R.id.alicetext);
        Aliceimg=(ImageView)findViewById(R.id.aliceavatar);
        Loginbutton=(Button)findViewById(R.id.askdoubtbtn);



        Loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }


}

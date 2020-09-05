package com.example.chatbotapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class SecondActivity extends AppCompatActivity {

    private EditText msg;
    private Button send;
    private Button back;
    int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        View view=this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.SpringGreen);

        final ScrollView scrollview = (ScrollView) findViewById(R.id.scroll) ;
        scrollview.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                scrollview.post(new Runnable() {
                    public void run() {
                        scrollview.fullScroll(View.FOCUS_DOWN);
                    }
                });
            }
        });
        final Button b = (Button) findViewById(R.id.someButton);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl2);

                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                if (count > 1)
                    params.addRule(RelativeLayout.BELOW,count-1);
                else {
                    params.addRule(RelativeLayout.BELOW,R.id.rl2);
                }

                Button secondBtn;
                secondBtn = new Button(SecondActivity.this);
                secondBtn.setLayoutParams(params);
                secondBtn.setId((int) count);
                secondBtn.setText("I have been created" + count);
                secondBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b.setEnabled(false);
                        b.setVisibility(View.INVISIBLE);
                    }
                });
                relativeLayout.addView(secondBtn);

                count++;
            }
        });

////        final Button initbtn=(Button)findViewById(R.id.init);
////        initbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // send server
//                // output x
//
//                int x = 3;
//
//            }
//        });

//        msg = (EditText)findViewById(R.id.typemessage);
//        send=(Button)findViewById(R.id.sendbtn);
//        back=(Button)findViewById(R.id.backbtn);
//
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
    }
}

package com.cly.eee.huidiao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import com.cly.eee.R;


public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_main);

        MyButton1 btn = (MyButton1)findViewById(R.id.btn_my);
        btn.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    Log.i("Activity01","监听器的onKeyDown方法被调用");
                }
                return false;
            }
        });

//        TextView tw = (TextView) findViewById(R.id.two);
//        tw.setOnKeyListener(new View.OnKeyListener(){
//            @Override
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//                if(event.getAction() == KeyEvent.ACTION_DOWN)
//                {
//                    Log.i("Activity01","监听器的onKeyDown方法被调用");
//                }
//                return false;
//            }
//
//         });



    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        Log.i("Activity01","Activity的onKeyDown方法被调用");
        return false;
    }
}



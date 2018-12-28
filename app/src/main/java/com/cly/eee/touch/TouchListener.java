package com.cly.eee.touch;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.cly.eee.R;

public class TouchListener extends Activity {

    private ImageView imgtouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_listener);

        imgtouch = (ImageView)findViewById(R.id.imgtouch);
        imgtouch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),"你通过监听器模式:OnTouchListener摸了伦家~",Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}
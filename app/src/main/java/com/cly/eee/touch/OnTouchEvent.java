package com.cly.eee.touch;

import android.app.Activity;
import android.os.Bundle;

import com.cly.eee.R;

public class OnTouchEvent extends Activity {
    private OnTouchEventMyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ontouch_event);

    }
}
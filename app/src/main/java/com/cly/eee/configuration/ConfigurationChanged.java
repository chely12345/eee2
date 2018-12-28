package com.cly.eee.configuration;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cly.eee.R;

public class ConfigurationChanged extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuration_changed);

        Button btn = (Button) findViewById(R.id.btnchange);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Configuration config = getResources().getConfiguration();
                //如果是横屏的话切换成竖屏
                if(config.orientation == Configuration.ORIENTATION_LANDSCAPE)
                {
                    ConfigurationChanged.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
                //如果竖屏的话切换成横屏
                if(config.orientation == Configuration.ORIENTATION_PORTRAIT)
                {
                    ConfigurationChanged.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                }
            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        String screen = newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE?"横屏":"竖屏";
        Toast.makeText(ConfigurationChanged.this, "系统屏幕方向发生改变 \n 修改后的方向为" + screen, Toast.LENGTH_SHORT).show();
    }
}

package com.example.a0_0.testandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView tv_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_text=(TextView)findViewById(R.id.tv_text);
    }
    protected void change(View view)
    {
        tv_text.setText(R.string.app_button_change);
    }
}

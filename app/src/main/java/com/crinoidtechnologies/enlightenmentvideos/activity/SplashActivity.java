package com.crinoidtechnologies.enlightenmentvideos.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crinoidtechnologies.enlightenmentvideos.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );
        Handler handler=new Handler(  );
        handler.postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent( SplashActivity.this, MainActivity.class );
                SplashActivity.this.startActivity( intent );
                finish();
            }
        },5000 );

    }
}

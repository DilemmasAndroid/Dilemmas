package com.goutham.dilemmas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        android.os.Handler handler=new android.os.Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sp=getSharedPreferences("generalPreferences",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();

                if(!(sp.contains("ViewLoginActivity"))){
                    editor.putBoolean("ViewLoginActivity",true);
                    editor.commit();
                }
                Intent i;
                Boolean a = sp.getBoolean("ViewLoginActivity",false);
                if(a == true){
                    editor.putBoolean("ViewLoginActivity",false);
                    editor.commit();
                    i = new Intent(getApplicationContext(),ThirdActivity.class);
                }else{
                    i = new Intent(getApplicationContext(),LoginActivity.class);
                }
                startActivity(i);
                finish();
            }
        }, 6000);
    }
}

package com.goutham.dilemmas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void goNext(View v){

        SharedPreferences sp = getSharedPreferences("generalPreferences",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        /* check whether name is unique */
        // add user to database if name is unique

        if(!(sp.contains("ViewIntroAtivity"))){
            editor.putBoolean("ViewIntroAtivity",true);
            editor.commit();
        }

        Intent i;
        Boolean a = sp.getBoolean("ViewIntroAtivity",false);
        if(a){
            editor.putBoolean("ViewIntroAtivity",false);
            editor.commit();
            i = new Intent(getApplicationContext(),IntroActivity.class);
        }
        else{
            i = new Intent(getApplicationContext(),MainActivity.class);
        }
        startActivity(i);
        finish();
    }


}

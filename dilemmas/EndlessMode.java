package com.goutham.dilemmas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class EndlessMode extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endless_mode);

        setContentView(R.layout.activity_endless_mode);
        TextView tv=(TextView)findViewById(R.id.td);

        tv.setText(Html.fromHtml(getString(R.string.your_text)));
    }

    public void nextbtn(View view)
    {
        Intent intents=new Intent(this,EndlessQuestions.class);
        startActivity(intents);

    }
}

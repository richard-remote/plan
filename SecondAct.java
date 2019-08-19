package com.example.plan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondAct extends AppCompatActivity{
    Button button;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        getSupportActionBar().setTitle("Act Two");
        button = findViewById(R.id.openThree);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                intent = new Intent(SecondAct.this, ThirdAct.class);
                startActivity(intent);
            }
        });
    }
}

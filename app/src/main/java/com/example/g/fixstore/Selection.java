package com.example.g.fixstore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Selection  extends AppCompatActivity {
    Button client,handyman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection);


        client = findViewById(R.id.client);
        client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(),CRegistration.class);
                startActivity(i);
            }
        });


        handyman = findViewById(R.id.handyman);
        handyman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(),HRegistration.class);
                startActivity(i);
            }
        });
    }
}

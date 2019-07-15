package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private Button button1;
        private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button1 =  findViewById(R.id.about_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutAlc();
            }
        });
        button2 = findViewById(R.id.profile_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfile();
            }
        });
    }
public void openAboutAlc(){
        Intent intent = new Intent(this, AboutAlc.class);
        startActivity(intent);
}
public void openMyProfile(){
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
}
}

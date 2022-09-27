package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private ImageButton imageButton;
     private TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton=findViewById(R.id.imageButton2);
        hello = findViewById(R.id.Hello);
    }

    public void TEST(View view) {
        imageButton.setImageResource(R.drawable.asss) ;
        hello.setVisibility (View.VISIBLE);
        imageButton.setClickable(true);
    }
}
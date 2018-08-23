package com.emarkova.session24;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.textView)).setText("Amination List");
        ((Button) findViewById(R.id.buttonNext)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityBaseXML.class);
                startActivity(intent);
            }
        });
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.myamindrawable);
        AnimationDrawable animationDrawable = (AnimationDrawable)imageView.getBackground();
        animationDrawable.start();
    }
}

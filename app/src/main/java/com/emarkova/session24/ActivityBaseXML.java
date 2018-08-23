package com.emarkova.session24;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityBaseXML extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlbase);
        ((TextView) findViewById(R.id.textView)).setText("Base animation");
        ((Button) findViewById(R.id.buttonNext)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityBaseXML.this, ActivityBaseCode.class);
                startActivity(intent);
            }
        });
        ImageView imageView = findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mybaseamin);
        imageView.setAnimation(animation);
    }
}

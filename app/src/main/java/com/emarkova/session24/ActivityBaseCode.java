package com.emarkova.session24;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityBaseCode extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlbase);
        ((TextView) findViewById(R.id.textView)).setText("Base animation Code");
        ((Button) findViewById(R.id.buttonNext)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityBaseCode.this, ActivityImageView.class);
                startActivity(intent);
            }
        });
        ImageView imageView = findViewById(R.id.imageView);
        Animation animationScale = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 50f, 50f);
        RotateAnimation animation = new RotateAnimation(
                0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        animation.setDuration(3000);
        animation.setInterpolator(new AccelerateInterpolator());
        //AnimationUtils.loadAnimation(this, R.anim.mybaseamin);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animation);
        animationSet.addAnimation(animationScale);
        imageView.setAnimation(animationSet);
    }
}

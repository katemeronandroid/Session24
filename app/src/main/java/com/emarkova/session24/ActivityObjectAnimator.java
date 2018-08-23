package com.emarkova.session24;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityObjectAnimator extends AppCompatActivity {
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlbase);
        ((TextView) findViewById(R.id.textView)).setText("Object animator");
        ((Button) findViewById(R.id.buttonNext)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityObjectAnimator.this, ActivityObjectAnimator.class);
                startActivity(intent);
            }
        });
        ImageView imageView = findViewById(R.id.imageView);
        Path path = new Path();
        path.moveTo(0, 0);
        path.quadTo(200, 0, 80, 200);
        ObjectAnimator animation = new ObjectAnimator().ofFloat(imageView, "x", "y", path);
        animation.setInterpolator(new PathInterpolator(0.4f, 0f, 1f, 1f));
        animation.setDuration(3000);
        animation.start();
    }
}

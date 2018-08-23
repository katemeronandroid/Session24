package com.emarkova.session24;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityImageView extends AppCompatActivity {
    private Scene sceneOne;
    private Scene sceneTwo;
    private Scene sceneThree;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tr);
        ((TextView) findViewById(R.id.textView)).setText("Transition Animator");
        ((Button) findViewById(R.id.buttonNext)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityImageView.this, ActivityObjectAnimator.class);
                startActivity(intent);
            }
        });

        ImageView imageView = findViewById(R.id.imageView);
        ViewGroup sceneRoot = (ViewGroup)findViewById(R.id.root_scene);
        sceneOne = Scene.getSceneForLayout(sceneRoot, R.layout.scene1,this);
        sceneTwo = Scene.getSceneForLayout(sceneRoot, R.layout.scene2,this);
        sceneThree = Scene.getSceneForLayout(sceneRoot, R.layout.scene3, this);
    }
    public void toSecond(View view){
        TransitionManager.go(sceneTwo);
    }
    public void toFirst(View view){
        TransitionManager.go(sceneOne);
    }
    public void toThird(View view){
        TransitionManager.go(sceneThree);
    }
}

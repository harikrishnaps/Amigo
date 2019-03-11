package com.example.amigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {


    ImageView imageView,logo_view;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        imageView = findViewById(R.id.bg);



        logo_view = findViewById(R.id.icon);
        animation = AnimationUtils.loadAnimation(this,R.anim.bganim);

        logo_view.animate().alpha(0).setDuration(800).setStartDelay(1500);
        imageView.animate().translationY(-2400).setDuration(800).setStartDelay(300);



        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startActivity = new Intent(getApplicationContext(),Login.class);
                startActivity(startActivity);
                finish();
            }
        }, 3000);

    }
}

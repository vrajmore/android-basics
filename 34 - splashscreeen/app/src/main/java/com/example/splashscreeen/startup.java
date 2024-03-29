package com.example.splashscreeen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.window.SplashScreen;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class startup extends AppCompatActivity {

    LottieAnimationView lt;
    ConstraintLayout ll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_startup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //        <item name="android:windowIsTranslucent">true</item>  add this to theme to theme.xml to disable default splash screen generated by android


        lt = findViewById(R.id.lottie);
        ll = findViewById(R.id.main);

        ll.setBackgroundColor(R.color.grey);
        lt.setAnimation(R.raw.media);
        lt.playAnimation();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(startup.this , MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);

    }

}
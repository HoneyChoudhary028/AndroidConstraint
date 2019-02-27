package com.example.rudra.constraintlayoutdemo;

import android.animation.ValueAnimator;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class Main3Activity extends AppCompatActivity {
    private ImageView earthImage,marsImage,saturnImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView earthImage = findViewById(R.id.earth_image);
        ImageView marsImage = findViewById(R.id.mars_image);
        ImageView saturnImage = findViewById(R.id.saturn_image);

           // ValueAnimator valueAnimator=animatePlanet(earthImage,TimeUnit.SECONDS.toMillis(2));


        ValueAnimator earthAnimator = animatePlanet(earthImage, TimeUnit.SECONDS.toMillis(2));
        ValueAnimator marsAnimator = animatePlanet(marsImage, TimeUnit.SECONDS.toMillis(6));
        ValueAnimator saturnAnimator = animatePlanet(saturnImage, TimeUnit.SECONDS.toMillis(12));

        earthAnimator.start();
        marsAnimator.start();
        saturnAnimator.start();
    }
    private ValueAnimator animatePlanet(ImageView planet, long orbitDuration) {

        ValueAnimator anim = ValueAnimator.ofInt(0, 359);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int val = (Integer) valueAnimator.getAnimatedValue();
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) planet.getLayoutParams();
                layoutParams.circleAngle = val;
                planet.setLayoutParams(layoutParams);
            }
        });

        anim.setDuration(orbitDuration);
        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatMode(ValueAnimator.RESTART);
        anim.setRepeatCount(ValueAnimator.INFINITE);

        return anim;
    }

}

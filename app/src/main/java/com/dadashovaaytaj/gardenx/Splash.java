package com.dadashovaaytaj.gardenx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {


    private final int SPLASH_DISPLAY_LENGTH = 2000;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                /* Create an Intent that will start the LogIn-Activity. */
                Intent mainIntent = new Intent(Splash.this,LogInActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }


}

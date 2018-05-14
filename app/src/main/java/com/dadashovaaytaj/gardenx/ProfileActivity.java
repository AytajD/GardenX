package com.dadashovaaytaj.gardenx;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView chosenName;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        img = findViewById(R.id.flower_profile);
        chosenName = findViewById(R.id.nameOfFlow);
        Bundle bundle = getIntent().getExtras();
        String receivedName = bundle.getString("chosenName");
        int receivedId = bundle.getInt("ID");
        chosenName.setText(receivedName);
        img.setImageResource(receivedId);

       // Round imageProfile
        ImageView imageView = (ImageView) findViewById(R.id.flower_profile);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), receivedId);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        imageView.setImageDrawable(roundedBitmapDrawable);
    }
    //onClick LogOut buttonu ucun. Back to the login activity
    public void LogOut(View view)
    {
        Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    //go to the statusActivity

    public void openStatusActivity(View view)
    {
        Intent intent = new Intent(this,StatusActivity.class);
        startActivity(intent);
    }

    public void openWebView(View view)
    {
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }

    public void openChat(View view)
    {
        Intent intent = new Intent(this,ChatActivity.class);
        startActivity(intent);
    }
}

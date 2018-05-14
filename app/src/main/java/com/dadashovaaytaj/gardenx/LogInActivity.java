package com.dadashovaaytaj.gardenx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {
    EditText usrname;
    EditText pssword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        usrname=(EditText) findViewById(R.id.username);
        pssword=(EditText) findViewById(R.id.password);
    }


    public void goNavDraw(View view)
    {
        if(usrname.getText().toString().equals("admin") && pssword.getText().toString().equals("12345"))
        {    //correcct password
            Intent intent = new Intent(this, NavActivity.class);
            startActivity(intent);

        }else
        {
            //wrong password
            Toast.makeText(getApplicationContext(), "Wrong Username or Password", Toast.LENGTH_SHORT).show();
        }
    }
}

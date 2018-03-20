package com.example.geetanshsharma.capstone1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity
{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        button=findViewById(R.id.signup);
    }
    public void AfterSignUp(View view)
    {
        Intent intent=new Intent(this,AfterSignUp.class);
        startActivity(intent);
    }
}

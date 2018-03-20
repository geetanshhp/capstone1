package com.example.geetanshsharma.capstone1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tv;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.create);
        button=findViewById(R.id.login);
    }
    public void SignUp(View view)
    {
        Intent intent=new Intent(this,SignUp.class);
        startActivity(intent);
    }
    public void AfterLogIn(View view)
    {
        Intent intent =new Intent(this,AfterLogIn.class);
        startActivity(intent);
    }
}

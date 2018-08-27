package com.example.lenovo.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(i1);
                break;
            case R.id.button2:
                //Intent i2=new Intent(Intent.ACTION_CALL, Uri.parse("999999999"));
                //it reqired permission
                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:999999999"));
                startActivity(i2);
                break;
            case R.id.button3:
                Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:20,78"));
                startActivity(i3);
                break;
        }
    }
}

package com.nbpzjy.learnas.activitylearn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.my_layout);

        System.out.println("onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");
    }

    @Override
            protected void onResume() {
        super.onResume();
        System.out.println("onResume");
    }

    @Override
            protected void onPause() {
        super.onPause();
        System.out.println("onPause");
    }

    @Override
            protected void onStop() {
        super.onStop();
        System.out.println("onStop");
    }

    @Override
            protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
    }



    @Override
            protected  void onRestart() {
        super.onRestart();
        System.out.println("onRestart");





        findViewById(R.id.btnStartAnotherAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                   startActivity(new Intent(MainActivity.this,AnotherAty.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nbpilot.com")));

            }
        });



    }
}

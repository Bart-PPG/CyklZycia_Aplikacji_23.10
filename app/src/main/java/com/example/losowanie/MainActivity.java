package com.example.losowanie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private Button losuj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CYKL ZYCIA", "wykonana metoda onStart");
        textView = findViewById(R.id.liczba);
        losuj = findViewById(R.id.button);

        losuj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int liczba = (int)(Math.random()*100*1);
                        textView.setText(String.valueOf(liczba));
                    }
                }
        );

    }

    @Override
    protected void onStart() {
        super.onStart();
        //metoda cyklu zycia nie moze byc wywolywana przez programiste
        Log.i("CYKL ZYCIA", "wykonana metoda onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CYKL ZYCIA", "wykonana metoda onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CYKL ZYCIA", "wykonana metoda onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CYKL ZYCIA", "wykonana metoda onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CYKL ZYCIA", "wykonana metoda onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CYKL ZYCIA", "wykonana metoda onSaveInstanceState");
    }
}
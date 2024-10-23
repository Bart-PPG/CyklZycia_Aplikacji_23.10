package com.example.losowanie;

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
}
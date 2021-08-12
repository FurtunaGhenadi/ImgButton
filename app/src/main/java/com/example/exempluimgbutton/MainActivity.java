package com.example.exempluimgbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton ImgButton1, ImgButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImgButton1 = (ImageButton) findViewById(R.id.imageButton1);
        ImgButton2 = (ImageButton) findViewById(R.id.imageButton2);

        ImgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Buton: 'Apple'", Toast.LENGTH_LONG).show();

            }
        });

        ImgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Buton: 'Wi-Fi'", Toast.LENGTH_LONG).show();
            }
        });

    }
}
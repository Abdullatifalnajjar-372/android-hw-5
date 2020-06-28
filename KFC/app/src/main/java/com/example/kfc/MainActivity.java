package com.example.kfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button apply = findViewById(R.id.apply);
        Button rs = findViewById(R.id.rsma);


        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(a);
            }

        });
        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/abdullatif_art/?igshid=1b0bft8heebq9"));
                startActivity(b);
            }
        });
    }
}

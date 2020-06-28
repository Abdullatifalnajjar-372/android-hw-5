package com.example.kfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView m =findViewById(R.id.yn);
        Bundle v = getIntent().getExtras();
        m.setText(v.getString("nm"));
        TextView t = findViewById(R.id.yage);
        Bundle r = getIntent().getExtras();
        t.setText(r.getInt("ag"));
        TextView u = findViewById(R.id.yemail);
        Bundle ou = getIntent().getExtras();
        u.setText(ou.getString("em"));
        TextView phone = findViewById(R.id.ynum);
        Bundle su = getIntent().getExtras();
        phone.setText(su.getInt("ph"));
        TextView chf = findViewById(R.id.ch1);
        Bundle ch = getIntent().getExtras();
        chf.setText(ch.getString("ch"));
        TextView chf = findViewById(R.id.ch2);
        Bundle cr = getIntent().getExtras();
        chf.setText(ch.getString("ch"));


    }
}

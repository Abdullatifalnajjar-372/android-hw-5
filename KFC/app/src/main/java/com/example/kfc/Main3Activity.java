package com.example.kfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button sub = findViewById(R.id.submit);
        final EditText n = findViewById(R.id.tname);
        final CheckBox ch = findViewById(R.id.checkBox);
        final CheckBox ca = findViewById(R.id.checkBox2);
        final EditText email,nm,ag;
        email = (EditText) findViewById(R.id.email);
        nm = (EditText) findViewById(R.id.editText7);
        ag = (EditText) findViewById(R.id.tage);



        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(Main3Activity.this,Main4Activity.class);
                s.putExtra("nm",n.getText().toString());
                s.putExtra("em",email.getText().toString());
                s.putExtra("ph",nm.getText().toString());
                s.putExtra("ch",ch.getText().toString());
                s.putExtra("ca",ca.getText().toString());
                s.putExtra("ag",ag.getText().toString());
                startActivity(s);
            }
        });
    }
}

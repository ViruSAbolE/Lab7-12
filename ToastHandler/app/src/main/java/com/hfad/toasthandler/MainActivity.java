package com.hfad.toasthandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    override fun;

    onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val button:Button = findViewById(R.id.button_ok);
        button.setOnClickListener; {
            val text = "Кнопка ОК";
            val duration = Toast.LENGTH_SHORT;

            val toast = Toast.makeText(applicationContext, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
}
package com.example.luna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void but(View view) {
        final EditText editText = findViewById(R.id.editTextText2);
        String text = editText.getText().toString();
        System.out.println(text);
        Integer[] spisok = new Integer[16];
        for (int i = 0; i < text.length(); i++) {
            spisok[i] = Integer.parseInt(Character.toString(text.charAt(i)));
        }
        int sum = 0;
        for (int i = 0; i < text.length(); i += 2) {
            if (spisok[i] * 2 >= 10) {
                spisok[i] = Integer.parseInt(Character.toString(Integer.toString(spisok[i]).charAt(0))) + Integer.parseInt(Character.toString(Integer.toString(spisok[i]).charAt(1)));
            } else {
                spisok[i] = spisok[i] * 2;
            }
            sum += spisok[i];
        }
        final TextView TextView = findViewById(R.id.textView3);
        if (sum % 10 == 0) {
            TextView.setText("Номер карты верен");
        } else {
            TextView.setText("Номер карты не верен");
        }
    }
}
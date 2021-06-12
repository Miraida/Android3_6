package com.geek.android3_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.geek.android3_6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding ui;
    private final Math math = new Math();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        setOnClicks();
    }

    private void setOnClicks() {
        ui.add.setOnClickListener(v -> result(math.add(getFirst(),getSecond())));
        ui.subtract.setOnClickListener(v -> result(math.subtract(getFirst(),getSecond())));
        ui.multiply.setOnClickListener(v -> result(math.multiply(getFirst(),getSecond())));
        ui.divide.setOnClickListener(v -> result(math.divide(getFirst(),getSecond())));
    }

    private void result(int subtract) {
        ui.result.setText(String.valueOf(subtract));
        ui.result.setVisibility(View.VISIBLE);
    }

    private int getFirst() {
        String text =ui.firstEdt.getText().toString();
        return text.equals("")?0:Integer.parseInt(text);
    }

    private int getSecond() {
        String text = ui.secondEdt.getText().toString();
        return text.equals("") ? 0 : Integer.parseInt(ui.secondEdt.getText().toString());
    }
}
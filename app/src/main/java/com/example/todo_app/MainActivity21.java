package com.example.todo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity21 extends AppCompatActivity {

    Button btnShowSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        btnShowSetting = findViewById(R.id.btnShowSetting);

        btnShowSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialAlertDialogBuilder(MainActivity21.this)
                        .setTitle("test")
                        .setMessage("test")
                        .setPositiveButton("test", null)
                        .setNegativeButton("test", null)
                        .show();
            }
        });
    }
}
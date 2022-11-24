package com.improve10x.advancedtemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TemplateAddBtnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_add_btn);
        getSupportActionBar().setTitle("AddTemplate");
        Button addBtn = findViewById(R.id.add1_btn);
        addBtn.setOnClickListener(view -> {
            EditText templateTxt = findViewById(R.id.template_txt);
            String template = templateTxt.getText().toString();
            Toast.makeText(this, template, Toast.LENGTH_SHORT).show();

        });




    }
}
package com.improve10x.advancedtemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class TemplateActivity extends AppCompatActivity {
    public ArrayList<Template> templateList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_template);
        getSupportActionBar().setTitle("Template");
        setData();
    }
    public void setData(){
        templateList = new ArrayList<>();

        Template   template  = new Template();
        template.titleTxt = "RRR";
        template.messageTxt = "PowerFull Action Movie";
        templateList.add(template);

        Template template1 = new Template();
        template.titleTxt = "Pushpa";
        template.messageTxt = "Action Movie";
        templateList.add(template1);




    }
}
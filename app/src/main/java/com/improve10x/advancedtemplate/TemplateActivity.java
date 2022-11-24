package com.improve10x.advancedtemplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TemplateActivity extends AppCompatActivity {
    public ArrayList<Template> templateList;
    public RecyclerView templateRv;
    public TemplateAdapter templateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_template);
        getSupportActionBar().setTitle("Template");
        setData();
        setTemplateList();
    }

    public void setTemplateList() {
        templateRv = findViewById(R.id.template_rv);
        templateRv.setLayoutManager(new LinearLayoutManager(this));
        templateAdapter = new TemplateAdapter();
        templateAdapter.setData(templateList);
        templateRv.setAdapter(templateAdapter);

    }

    public void setData(){
        templateList = new ArrayList<>();

        Template   template  = new Template();
        template.titleTxt = "RRR";
        template.messageTxt = "PowerFull Action Movie";
        templateList.add(template);

        Template template1 = new Template();
        template1.titleTxt = "Pushpa";
        template1.messageTxt = "Action Movie";
        templateList.add(template1);




    }
}
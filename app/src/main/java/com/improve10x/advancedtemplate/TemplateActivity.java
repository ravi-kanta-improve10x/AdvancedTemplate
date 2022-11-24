package com.improve10x.advancedtemplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TemplateActivity extends AppCompatActivity {
    public ArrayList<Template> templateList;
    public RecyclerView templateRv;
    public TemplateAdapter templateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_template);
        getSupportActionBar().setTitle("Template");
        handleAddBtn();
        setData();
        setTemplateList();
        fetchTask();
    }

    public void handleAddBtn() {
        Button addBtn = findViewById(R.id.template_add_btn);
        addBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,TemplateAddBtnActivity.class);
            startActivity(intent);
        });
    }

    public void fetchTask() {
        TemplateApi templateApi = new TemplateApi();
        TemplateService templateService = templateApi.createTemplateService();
        Call<List<Template>> call = templateService.fetchTask();
        call.enqueue(new Callback<List<Template>>() {
            @Override
            public void onResponse(Call<List<Template>> call, Response<List<Template>> response) {
                List<Template> templateList = response.body();
                templateAdapter.setData(templateList);

            }

            @Override
            public void onFailure(Call<List<Template>> call, Throwable t) {
                Toast.makeText(TemplateActivity.this, "Try Again", Toast.LENGTH_SHORT).show();

            }
        });
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
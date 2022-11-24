package com.improve10x.advancedtemplate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TemplateAdapter extends RecyclerView.Adapter<TemplateViewHolder> {

    public List<Template> templateArrayList;

    public void setData(List<Template> templateList){
        templateArrayList = templateList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TemplateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item,parent,false);
        TemplateViewHolder templateViewHolder = new TemplateViewHolder(view);
        return templateViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TemplateViewHolder holder, int position) {
        Template template = templateArrayList.get(position);
        holder.messageTxt.setText(template.messageTxt);
    }

    @Override
    public int getItemCount() {
        return templateArrayList.size();
    }
}

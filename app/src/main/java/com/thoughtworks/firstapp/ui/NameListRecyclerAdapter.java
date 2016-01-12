package com.thoughtworks.firstapp.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thoughtworks.firstapp.R;

import java.util.ArrayList;
import java.util.List;

public class NameListRecyclerAdapter extends RecyclerView.Adapter<NameListRecyclerAdapter.ViewHolder> {

    private List<String> nameList;

    public NameListRecyclerAdapter() {
        this.nameList = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.populate(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameText;
        TextView secondText;

        public ViewHolder(View itemView) {
            super(itemView);
            nameText = (TextView) itemView.findViewById(android.R.id.text1);
            secondText = (TextView) itemView.findViewById(android.R.id.text2);
        }

        public void populate(String name) {
            nameText.setText(name);
            secondText.setText(name.toLowerCase());
        }
    }
}

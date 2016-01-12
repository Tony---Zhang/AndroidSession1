package com.thoughtworks.firstapp.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NameListAdapter extends BaseAdapter {

    private List<String> nameList;

    public NameListAdapter() {
        this.nameList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return nameList.size();
    }

    @Override
    public Object getItem(int position) {
        return nameList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            // init inflater
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            // inflate xml layout to view
            convertView = inflater.inflate(android.R.layout.simple_list_item_2, null);
            ViewHolder viewHolder = new ViewHolder(convertView);

            convertView.setTag(viewHolder);
        }
        ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.populate((String) getItem(position));

        return convertView;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    static class ViewHolder {

        TextView nameText;
        TextView secondText;

        public ViewHolder(View view) {
            nameText = (TextView) view.findViewById(android.R.id.text1);
            secondText = (TextView) view.findViewById(android.R.id.text2);
        }

        public void populate(String name) {
            nameText.setText(name);
            secondText.setText(name.toLowerCase());
        }
    }
}

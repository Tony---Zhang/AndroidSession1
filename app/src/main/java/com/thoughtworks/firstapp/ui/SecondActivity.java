package com.thoughtworks.firstapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;

import com.thoughtworks.firstapp.R;

import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {

    private ListView mNameListView;
    private NameListAdapter mNameListAdapter;

    private RecyclerView mNameRecyclerView;
    private NameListRecyclerAdapter mNameListRecyclerAdapter;

    private final String[] names = new String[]{"DaShi", "HaoGe", "NiangNiang", "LiuDan",
            "DaShi", "HaoGe", "NiangNiang", "LiuDan",
            "DaShi", "HaoGe", "NiangNiang", "LiuDan",
            "DaShi", "HaoGe", "NiangNiang", "LiuDan",
            "DaShi", "HaoGe", "NiangNiang", "LiuDan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        bindDataWithListView();
        bindDataWithRecyclerView();
    }

    private void bindDataWithListView() {
        mNameListView = (ListView) findViewById(R.id.name_list_view);
        mNameListView.setVisibility(View.VISIBLE);
        mNameListAdapter = new NameListAdapter();
        mNameListView.setAdapter(mNameListAdapter);

        findViewById(R.id.name_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initListData();
            }
        });
    }

    private void initListData() {
        mNameListAdapter.setNameList(Arrays.asList(names));
        mNameListAdapter.notifyDataSetChanged();
    }

    private void bindDataWithRecyclerView() {
        mNameRecyclerView = (RecyclerView) findViewById(R.id.name_recycler_view);
        mNameRecyclerView.setVisibility(View.VISIBLE);
        mNameRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mNameListRecyclerAdapter = new NameListRecyclerAdapter();
        mNameRecyclerView.setAdapter(mNameListRecyclerAdapter);

        findViewById(R.id.name_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initRecyclerViewData();
            }
        });
    }

    private void initRecyclerViewData() {
        mNameListRecyclerAdapter.setNameList(Arrays.asList(names));
        mNameListRecyclerAdapter.notifyDataSetChanged();
    }
}

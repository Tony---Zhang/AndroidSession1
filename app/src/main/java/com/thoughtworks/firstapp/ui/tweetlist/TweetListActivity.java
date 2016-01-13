package com.thoughtworks.firstapp.ui.tweetlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.reflect.TypeToken;
import com.thoughtworks.firstapp.R;
import com.thoughtworks.firstapp.model.Tweet;
import com.thoughtworks.firstapp.model.User;
import com.thoughtworks.firstapp.util.AssetHelper;

import java.util.List;

public class TweetListActivity extends AppCompatActivity {

    RecyclerView mTweetList;
    TweetRecyclerAdapter mTweetAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_list);

        initViews();
        initData();
    }

    private void initViews() {
        mTweetList = (RecyclerView) findViewById(R.id.tweet_list);
        mTweetList.setLayoutManager(new LinearLayoutManager(this));
        mTweetAdapter = new TweetRecyclerAdapter();
        mTweetList.setAdapter(mTweetAdapter);
    }

    private void initData() {
        User user = AssetHelper.readAssetResource(this, "user.json", User.class);
        List<Tweet> tweets = AssetHelper.readAssetResource(this, "tweets.json", new TypeToken<List<Tweet>>() {
        }.getType());

        mTweetAdapter.setUser(user);
        mTweetAdapter.setTweetList(tweets);
        mTweetAdapter.notifyDataSetChanged();
    }
}

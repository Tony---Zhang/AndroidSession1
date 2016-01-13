package com.thoughtworks.firstapp.ui.tweetlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.thoughtworks.firstapp.R;
import com.thoughtworks.firstapp.model.Tweet;
import com.thoughtworks.firstapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class TweetRecyclerAdapter extends RecyclerView.Adapter {

    private static final int VIEW_TYPE_USER = 0;
    private static final int VIEW_TYPE_TWEET = 1;

    private List<Tweet> tweetList;
    private User user;

    public TweetRecyclerAdapter() {
        this.user = new User();
        this.tweetList = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case VIEW_TYPE_USER:
                return new UserViewHolder(inflater.inflate(R.layout.tweet_header_layout, parent, false));
            case VIEW_TYPE_TWEET:
                return new TweetViewHolder(inflater.inflate(R.layout.tweet_item_layout, parent, false));
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        switch (viewType) {
            case VIEW_TYPE_USER:
                ((UserViewHolder) holder).populate(user);
                break;
            case VIEW_TYPE_TWEET:
                ((TweetViewHolder) holder).populate(tweetList.get(position - 1));
                break;
            default:
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return VIEW_TYPE_USER;
        } else {
            return VIEW_TYPE_TWEET;
        }
    }

    @Override
    public int getItemCount() {
        return tweetList.size() + 1;
    }

    public void setTweetList(List<Tweet> tweetList) {
        this.tweetList = tweetList;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

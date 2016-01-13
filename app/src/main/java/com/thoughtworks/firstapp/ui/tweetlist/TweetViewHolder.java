package com.thoughtworks.firstapp.ui.tweetlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.thoughtworks.firstapp.R;
import com.thoughtworks.firstapp.model.Tweet;
import com.thoughtworks.firstapp.model.User;

public class TweetViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIconImage;
    private TextView mSenderNameText;
    private TextView mContentText;
    private Context mContext;

    public TweetViewHolder(View itemView) {
        super(itemView);

        mContext = itemView.getContext();
        mIconImage = (ImageView) itemView.findViewById(R.id.tweet_sender_icon);
        mSenderNameText = (TextView) itemView.findViewById(R.id.tweet_sender_name);
        mContentText = (TextView) itemView.findViewById(R.id.tweet_content);
    }

    public void populate(Tweet tweet) {
        User sender = tweet.getSender();
        Glide.with(mContext).load(sender.getAvatar())
                .placeholder(R.mipmap.ic_launcher).crossFade().into(mIconImage);
        mSenderNameText.setText(sender.getNick());
        mContentText.setText(tweet.getContent());
    }
}

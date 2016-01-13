package com.thoughtworks.firstapp.ui.tweetlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.thoughtworks.firstapp.R;
import com.thoughtworks.firstapp.model.User;

public class UserViewHolder extends RecyclerView.ViewHolder {

    private ImageView mProfileImage;
    private ImageView mAvatarImage;
    private TextView mUserNickText;
    private Context mContext;

    public UserViewHolder(View itemView) {
        super(itemView);
        mContext = itemView.getContext();
        mProfileImage = (ImageView) itemView.findViewById(R.id.header_bg);
        mAvatarImage = (ImageView) itemView.findViewById(R.id.user_avatar);
        mUserNickText = (TextView) itemView.findViewById(R.id.user_nick);
    }

    public void populate(User user) {
        Glide.with(mContext).load(user.getProfileImage()).into(mProfileImage);
        Glide.with(mContext).load(user.getAvatar()).placeholder(R.mipmap.ic_launcher).crossFade().into(mAvatarImage);
        mUserNickText.setText(user.getNick());
    }
}

package com.example.billy.imagelist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by billy on 2017-07-29.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;
    public TextView text;

    public ViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.imageTitle);
        text = (TextView) itemView.findViewById(R.id.textTitle);
    }
}

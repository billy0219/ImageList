package com.example.billy.imagelist;

/**
 * Created by billy on 2017-07-29.
 */

public class ViewItem {
    private int image;
    private String title;

    public int getImage() {
        return this.image;
    }
    public String getTitle() {
        return this.title;
    }

    ViewItem(int image, String title) {
        this.image = image;
        this.title = title;
    }
}

package com.example.effe_21ca.models;

import android.net.Uri;

public class TASKS {

    String title,link,point,image;


    public TASKS() {
    }

    public TASKS(String title, String link, String point) {
        this.title = title;
        this.link = link;
        this.point = point;

    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {

        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }


}
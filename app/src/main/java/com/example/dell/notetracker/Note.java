package com.example.dell.notetracker;

import android.content.Context;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Note implements Serializable {

    private long mDateTime;
    private String mTitle;
    private String mContent;

    public Note(long dateTime ,String title, String content )  {
        mDateTime =dateTime;
        mTitle =title;
        mContent =content;

    }

    public void setDateTime(long DateTime) {
        mDateTime = DateTime;
    }

    public void setTitle(String Title) {
        mTitle = Title;
    }

    public void setContent(String Content) {
        mContent = Content;
    }

    public long getDateTime() {
        return mDateTime;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getContent() {
        return mContent;
    }

    public String getDateTimeFormatted(Context context) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss"
        , context.getResources().getConfiguration().locale);
        sdf.setTimeZone(TimeZone.getDefault());
        return sdf.format(new Date(mDateTime));
    }
}


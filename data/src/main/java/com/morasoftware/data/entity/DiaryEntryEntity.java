package com.morasoftware.data.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by chocollo on 4/24/17.
 */

public class DiaryEntryEntity {

    @SerializedName("id")
    private int userId;

    @SerializedName("diaryName")
    private String diaryName;

    @SerializedName("date")
    private Date date;

    public DiaryEntryEntity() {
        //empty constructor
    }

    public int getUserId() {
        return userId;
    }

    public Date getDate() {
        return date;
    }

    public String getDiaryName() {
        return diaryName;
    }
}

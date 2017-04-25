package com.morasoftware.data.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chocollo on 4/24/17.
 */

public class CalorieDiaryEntryEntity extends DiaryEntryEntity {

    @SerializedName("totalCalories")
    private int totalCalories;

    @SerializedName("foodItems")
    private List<FoodEntity> foodEntityList;

    public int getTotalCalories() {
        return totalCalories;
    }

    public List<FoodEntity> getFoodEntityList() {
        return foodEntityList;
    }
}

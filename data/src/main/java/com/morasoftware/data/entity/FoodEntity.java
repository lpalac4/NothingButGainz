package com.morasoftware.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chocollo on 4/24/17.
 */

class FoodEntity {

    @SerializedName("name")
    private String name;

    @SerializedName("calories")
    private int calories;

    @SerializedName("servingSize")
    private float servingSize;

    @SerializedName("proteinGrams")
    private float proteinGrams;

    @SerializedName("carbsGrams")
    private float carbsGrams;

    @SerializedName("healthyFatGrams")
    private float healthyFatGrams;

    @SerializedName("unhealthyFatGrams")
    private float unhealthyFatGrams;
}

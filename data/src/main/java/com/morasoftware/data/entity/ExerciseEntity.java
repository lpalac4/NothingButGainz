package com.morasoftware.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chocollo on 4/24/17.
 */

public class ExerciseEntity {

    @SerializedName("reps")
    private int reps;

    @SerializedName("weight")
    private float weight;

    public ExerciseEntity() {

    }
}

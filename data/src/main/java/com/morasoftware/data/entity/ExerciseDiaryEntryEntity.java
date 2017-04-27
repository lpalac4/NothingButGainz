package com.morasoftware.data.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chocollo on 4/24/17.
 */

public class ExerciseDiaryEntryEntity extends DiaryEntryEntity {

    @SerializedName("exerciseName")
    private String exerciseName;

    @SerializedName("sets")
    private List<ExerciseEntity> sets;

    public List<ExerciseEntity> getSets() {
        return sets;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public ExerciseDiaryEntryEntity() {

    }
}

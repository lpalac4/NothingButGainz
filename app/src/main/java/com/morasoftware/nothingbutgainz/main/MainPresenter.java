package com.morasoftware.nothingbutgainz.main;

import com.morasoftware.domain.CalorieDiaryEntry;
import com.morasoftware.domain.ExerciseDiaryEntry;
import com.morasoftware.domain.interactor.DefaultObserver;
import com.morasoftware.domain.interactor.GetUserCalorieDiary;
import com.morasoftware.domain.interactor.GetUserExerciseDiary;

import java.util.Date;
import java.util.List;

/**
 * Created by luispalacios on 4/26/17.
 */

public class MainPresenter
{
    private GetUserExerciseDiary mGetUserExerciseDiaryUseCase;
    private GetUserCalorieDiary mGetUserCalorieDiaryUseCase;
    private int mUserId;

    public MainPresenter() {

    }

    public void getUserDiaries() {
        mGetUserCalorieDiaryUseCase.execute(new CalorieDiaryObservable(), GetUserCalorieDiary.Params.forUserAndDates(mUserId, new Date()));
        mGetUserExerciseDiaryUseCase.execute(new ExerciseDiaryObservable(), GetUserExerciseDiary.Params.forUserAndDates(mUserId, new Date()));
    }

    private class CalorieDiaryObservable extends DefaultObserver<List<CalorieDiaryEntry>>
    {
        @Override
        public void onComplete()
        {
            super.onComplete();
        }

        @Override
        public void onError(Throwable exception)
        {
            super.onError(exception);
        }

        @Override
        public void onNext(List<CalorieDiaryEntry> calorieDiaryEntry)
        {
            super.onNext(calorieDiaryEntry);
        }
    }

    private class ExerciseDiaryObservable extends DefaultObserver<List<ExerciseDiaryEntry>>
    {
        @Override
        public void onComplete()
        {
            super.onComplete();
        }

        @Override
        public void onError(Throwable exception)
        {
            super.onError(exception);
        }

        @Override
        public void onNext(List<ExerciseDiaryEntry> exerciseDiaryEntry)
        {
            super.onNext(exerciseDiaryEntry);
        }
    }
}

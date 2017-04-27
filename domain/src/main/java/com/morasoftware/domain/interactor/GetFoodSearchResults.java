package com.morasoftware.domain.interactor;

import com.morasoftware.domain.Food;
import com.morasoftware.domain.executor.PostExecutionThread;
import com.morasoftware.domain.executor.ThreadExecutor;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by chocollo on 4/24/17.
 */

public class GetFoodSearchResults extends UseCase<List<Food>, Void>{

    @Inject
    GetFoodSearchResults(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
    }

    @Override
    Observable<List<Food>> buildUseCaseObservable(Void aVoid) {
        return null;
    }
}

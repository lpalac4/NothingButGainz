package com.morasoftware.domain.interactor;

import com.morasoftware.domain.CalorieDiaryEntry;
import com.morasoftware.domain.User;
import com.morasoftware.domain.executor.PostExecutionThread;
import com.morasoftware.domain.executor.ThreadExecutor;
import com.morasoftware.domain.repository.UserRepository;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * This class is an implementation of {@link UseCase} that represents a use case for
 * retrieving a collection of all {@link User}.
 */
public class GetUserCalorieDiary extends UseCase<List<CalorieDiaryEntry>, GetUserCalorieDiary.Params> {

    private final UserRepository userRepository;

    @Inject
    GetUserCalorieDiary(UserRepository userRepository, ThreadExecutor threadExecutor,
                        PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.userRepository = userRepository;
    }

    @Override Observable<List<CalorieDiaryEntry>> buildUseCaseObservable(GetUserCalorieDiary.Params unused) {
        return this.userRepository.calorieDiaries();
    }

    public static final class Params
    {
        private final int mUserId;
        private final Date mDate;

        private Params(int userId, Date date)
        {
            this.mUserId = userId;
            this.mDate = date;
        }

        public static Params forUser(int userId)
        {
            return new Params(userId, null);
        }

        public static Params forUserAndDates(int userId, Date date) {
            return new Params(userId, date);
        }
    }
}

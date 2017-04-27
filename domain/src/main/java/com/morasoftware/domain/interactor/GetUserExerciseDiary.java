package com.morasoftware.domain.interactor;

import com.morasoftware.domain.User;
import com.morasoftware.domain.executor.PostExecutionThread;
import com.morasoftware.domain.executor.ThreadExecutor;
import com.morasoftware.domain.repository.UserRepository;

import java.util.Date;

import io.reactivex.Observable;
import javax.inject.Inject;

/**
 * This class is an implementation of {@link UseCase} that represents a use case for
 * retrieving data related to an specific {@link User}.
 */
public class GetUserExerciseDiary extends UseCase<User, GetUserExerciseDiary.Params> {

  private final UserRepository userRepository;

  @Inject
  GetUserExerciseDiary(UserRepository userRepository, ThreadExecutor threadExecutor,
                       PostExecutionThread postExecutionThread) {
    super(threadExecutor, postExecutionThread);
    this.userRepository = userRepository;
  }

  @Override Observable<User> buildUseCaseObservable(Params params) {
//    Preconditions.checkNotNull(params);
    return this.userRepository.user(params.mUserId);
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

        public static Params forUser(int userId, Date date)
        {
            return new Params(userId, date);
        }
    }
}

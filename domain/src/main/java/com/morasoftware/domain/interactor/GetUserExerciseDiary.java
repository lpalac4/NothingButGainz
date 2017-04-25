package com.morasoftware.domain.interactor;

import com.morasoftware.domain.User;
import com.morasoftware.domain.executor.PostExecutionThread;
import com.morasoftware.domain.executor.ThreadExecutor;
import com.morasoftware.domain.repository.UserRepository;

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
    return this.userRepository.user(params.userId);
  }

  public static final class Params {

    private final int userId;

    private Params(int userId) {
      this.userId = userId;
    }

    public static Params forUser(int userId) {
      return new Params(userId);
    }
  }
}

package com.morasoftware.domain.interactor;

import com.morasoftware.domain.User;
import com.morasoftware.domain.executor.PostExecutionThread;
import com.morasoftware.domain.executor.ThreadExecutor;
import com.morasoftware.domain.repository.UserRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by chocollo on 4/24/17.
 */

public class GetUserCase extends UseCase<List<User>, Void> {

    private final UserRepository userRepository;

    @Inject
    GetUserCase(UserRepository userRepository, ThreadExecutor threadExecutor,
                        PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.userRepository = userRepository;
    }

    @Override
    Observable<List<User>> buildUseCaseObservable(Void unused) {
        return this.userRepository.users();
    }
}

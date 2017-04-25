package com.morasoftware.domain.repository;

import com.morasoftware.domain.User;

import io.reactivex.Observable;
import java.util.List;

/**
 * Interface that represents a Repository for getting {@link User} related data.
 */
public interface UserRepository {
  /**
   * Get an {@link Observable} which will emit a List of {@link User}.
   */
  Observable<List<User>> users();

  /**
   * Get an {@link Observable} which will emit a {@link User}.
   *
   * @param userId The User id used to retrieve User data.
   */
  Observable<User> user(final int userId);
}

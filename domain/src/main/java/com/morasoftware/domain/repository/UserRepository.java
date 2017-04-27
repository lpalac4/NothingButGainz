package com.morasoftware.domain.repository;

import com.morasoftware.domain.CalorieDiaryEntry;
import com.morasoftware.domain.ExerciseDiaryEntry;
import com.morasoftware.domain.User;

import io.reactivex.Observable;

import java.util.Date;
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

    /**
     * Get an {@link Observable} which will emit a List of {@link CalorieDiaryEntry}.
     */
    Observable<List<CalorieDiaryEntry>> calorieDiaries();

    /**
     * Get an {@link Observable} which will emit a {@link CalorieDiaryEntry}.
     *
     * @param userId The User id used to retrieve User data.
     */
    Observable<CalorieDiaryEntry> calorieDiary(final int userId, final Date date);

    /**
     * Get an {@link Observable} which will emit a List of {@link ExerciseDiaryEntry}.
     */
    Observable<List<ExerciseDiaryEntry>> exerciseDiaries();

    /**
     * Get an {@link Observable} which will emit a {@link ExerciseDiaryEntry}.
     *
     * @param userId The User id used to retrieve User data.
     */
    Observable<ExerciseDiaryEntry> exerciseDiary(final int userId, final Date date);
}

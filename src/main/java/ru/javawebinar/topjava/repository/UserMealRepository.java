package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.UserMeal;

import java.util.Date;
import java.util.List;

/**
 * GKislin
 * 06.03.2015.
 */
public interface UserMealRepository {

    UserMeal save(String userId, UserMeal userMeal);

    boolean delete(String useId, String id);

    UserMeal get(String userId, String id);

    List<UserMeal> getFromTo(Date from, Date to);

    List<UserMeal> getAll(String userId);


}

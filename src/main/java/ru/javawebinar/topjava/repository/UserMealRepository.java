package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.UserMeal;

import java.util.Date;
import java.util.List;

/**
 * GKislin
 * 06.03.2015.
 */
public interface UserMealRepository {

    UserMeal save(int userId, UserMeal userMeal);

    boolean delete(int useId, int id);

    UserMeal get(int userId, int id);

    List<UserMeal> getFromTo(Date from, Date to);

    List<UserMeal> getAll(int userId);


}

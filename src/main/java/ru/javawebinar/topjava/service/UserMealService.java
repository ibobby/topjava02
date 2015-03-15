package ru.javawebinar.topjava.service;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.util.exception.NotFoundException;

import java.util.Date;
import java.util.List;

/**
 * GKislin
 * 09.03.2015.
 */
public interface UserMealService {

    public UserMeal save(int userId, UserMeal userMeal);

    public void delete(int userId, int id) throws NotFoundException;

    public List<UserMeal> getAll(int userId);

    public UserMeal get(int userId, int id) throws NotFoundException;

    public List<UserMeal> getFromTo(Date from, Date to);

    public void update(int userId, UserMeal userMeal) throws NotFoundException;



}

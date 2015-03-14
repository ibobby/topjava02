package ru.javawebinar.topjava.service;

import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.util.exception.NotFoundException;

import java.util.Date;
import java.util.List;

/**
 * GKislin
 * 09.03.2015.
 */
public interface UserMealService {

    public UserMeal save(String userId, UserMeal userMeal);

    public void delete(String userId, String id) throws NotFoundException;

    public List<UserMeal> getAll(String userId);

    public UserMeal get(String userId, String id) throws NotFoundException;

    public List<UserMeal> getFromTo(Date from, Date to);

    public void update(String userId, UserMeal userMeal) throws NotFoundException;



}

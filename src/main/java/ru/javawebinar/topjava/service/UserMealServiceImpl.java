package ru.javawebinar.topjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.repository.UserMealRepository;
import ru.javawebinar.topjava.util.exception.ExceptionUtil;
import ru.javawebinar.topjava.util.exception.NotFoundException;

import java.util.Date;
import java.util.List;

/**
 * GKislin
 * 06.03.2015.
 */
@Repository
public class UserMealServiceImpl implements UserMealService {

    @Autowired
    private UserMealRepository repository;

    @Override
    public UserMeal save(String userId, UserMeal userMeal) {
        return ExceptionUtil.check(repository.save(userId, userMeal), userId);
    }

    @Override
    public void delete(String userId, String id) throws NotFoundException {
        ExceptionUtil.check(repository.delete(userId, id), id);
    }

    @Override
    public List<UserMeal> getAll(String userId) {
        return ExceptionUtil.check(repository.getAll(userId), userId);
    }

    @Override
    public UserMeal get(String userId, String id) throws NotFoundException {
        return ExceptionUtil.check(repository.get(userId, id), id);
    }

    @Override
    public List<UserMeal> getFromTo(Date from, Date to) {
        return repository.getFromTo(from, to);
    }

    @Override
    public void update(String userId, UserMeal userMeal) throws NotFoundException {
        ExceptionUtil.check(repository.save(userId, userMeal), userId);
    }
}

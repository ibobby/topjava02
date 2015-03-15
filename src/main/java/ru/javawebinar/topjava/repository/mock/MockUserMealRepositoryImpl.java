package ru.javawebinar.topjava.repository.mock;

import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.LoggerWrapper;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.repository.UserMealRepository;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * GKislin
 * 09.03.2015.
 */
@Repository
public class MockUserMealRepositoryImpl implements UserMealRepository {
    @Override
    public List<UserMeal> getFromTo(Date from, Date to) {
        LOG.info("get from " + from + " to " + to);
        return Collections.emptyList();
    }

    private static final LoggerWrapper LOG = LoggerWrapper.get(UserMealRepository.class);

    @Override
    public UserMeal save(int userId, UserMeal userMeal) {
        LOG.info("save meal {} for {}", userMeal, userId);
        return userMeal;
    }

    @Override
    public boolean delete(int userId, int id) {
        LOG.info("delete meal {} of {} ", id, userId);
        return true;
    }

    @Override
    public UserMeal get(int userId, int id) {
        LOG.info("get meal {} for {} ", id, userId);
        return null;
    }

    @Override
    public List<UserMeal> getAll(int userId) {
        LOG.info("getAll meal of {} ", userId);
        return Collections.emptyList();
    }
}

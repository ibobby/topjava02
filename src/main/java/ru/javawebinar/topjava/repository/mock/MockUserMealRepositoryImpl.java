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
    public UserMeal save(String userId, UserMeal userMeal) {
        LOG.info("save "  + userMeal + " of " + userId);
        return userMeal;
    }

    @Override
    public boolean delete(String userId, String id) {
        LOG.info("delete " + id + " of " + userId);
        return true;
    }

    @Override
    public UserMeal get(String userId, String id) {
        LOG.info("get " + id + " of " + userId);
        return null;
    }

    @Override
    public List<UserMeal> getAll(String userId) {
        LOG.info("getAll meal of " + userId);
        return Collections.emptyList();
    }
}

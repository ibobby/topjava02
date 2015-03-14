package ru.javawebinar.topjava.web.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.topjava.LoggerWrapper;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.service.UserMealServiceImpl;

import java.util.List;

/**
 * GKislin
 * 06.03.2015.
 */
@Controller
public class UserMealRestController {

    private static final LoggerWrapper LOG = LoggerWrapper.get(UserMealRestController.class);

    @Autowired
    private UserMealServiceImpl service;

    public List<UserMeal> getAll(String userId) {
        LOG.info("getAll meal " + " of user" + userId);
        return service.getAll(userId);
    }

    public UserMeal get(String userId, String id) {
        LOG.info("get meal " + id + " of " + userId);
        return service.get(userId, id);
    }

    public UserMeal create(String userId, UserMeal userMeal) {
        LOG.info("create meal " + userMeal + " of " + userId);
        return service.save(userId, userMeal);
    }

    public void delete(String userId, String id) {
        LOG.info("delete meal" + id + " of " + userId);
        service.delete(userId, id);
    }

    public void update(String userId, UserMeal userMeal) {
        LOG.info("update meal " + userMeal + " of " + userId);
        service.update(userId, userMeal);
    }

}

package ru.javawebinar.topjava.web.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.topjava.LoggedUser;
import ru.javawebinar.topjava.LoggerWrapper;
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

    public List<UserMeal> getAll() {
        int userId = LoggedUser.id();
        LOG.info("getAll meal {} for user {} ", userId);
        return service.getAll(userId);
    }

    public UserMeal get(int id) {
        int userId = LoggedUser.id();
        LOG.info("get meal {} for user {} ", id, userId);
        return service.get(userId, id);
    }

    public UserMeal create(UserMeal userMeal) {
        int userId = LoggedUser.id();
        LOG.info("create meal {} for {} ", userMeal, userId);
        return service.save(userId, userMeal);
    }

    public void delete(int id) {
        int userId = LoggedUser.id();
        LOG.info("delete meal {} for {} ", id, userId);
        service.delete(userId, id);
    }

    public void update(UserMeal userMeal) {
        int userId = LoggedUser.id();
        LOG.info("update meal {} for {}", userMeal, userId);
        service.update(userId, userMeal);
    }

}

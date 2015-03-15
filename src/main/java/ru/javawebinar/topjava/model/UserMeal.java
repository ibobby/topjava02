package ru.javawebinar.topjava.model;

import ru.javawebinar.topjava.util.TimeUtil;

import java.time.LocalDateTime;

/**
 * GKislin
 * 06.03.2015.
 */
public class UserMeal extends BaseEntity {

    private User user;

    protected String description;

    protected int calories;

    protected LocalDateTime dateTime;

    public UserMeal() {}

    public UserMeal(String name, User user) {
        super();
    }

    @Override
    public String toString() {
        return "Meal(" + id + ", " + TimeUtil.toString(dateTime) + ", " + description + '\'' + "calories: " + calories +')';
    }
}

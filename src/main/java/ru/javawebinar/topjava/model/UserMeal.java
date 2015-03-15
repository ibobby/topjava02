package ru.javawebinar.topjava.model;

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
        return "Meal(" + id + ", " + dateTime + ", " + description + '\'' + "calories: " + calories +')';
    }
}

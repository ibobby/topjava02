package ru.javawebinar.topjava.model;

/**
 * GKislin
 * 06.03.2015.
 */
public class UserMeal extends NamedEntity {

    private User user;

    public UserMeal() {}

    public UserMeal(String name, User user) {

    }

    @Override
    public String toString() {
        return "UserMeal{" +
                "name='" + name + '\'' +
                "user=" + user +
                '}';
    }
}

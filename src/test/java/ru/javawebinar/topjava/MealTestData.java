package ru.javawebinar.topjava;

import ru.javawebinar.topjava.matcher.ModelMatcher;
import ru.javawebinar.topjava.model.BaseEntity;
import ru.javawebinar.topjava.model.UserMeal;

import java.time.LocalDateTime;
import java.util.function.Function;

/**
 * GKislin
 * 13.03.2015.
 */
public class MealTestData {


    private static final LoggerWrapper LOG = LoggerWrapper.get(UserTestData.class);

    public static final int MEAL1_ID = BaseEntity.START_SEQ + 2;

    public static final UserMeal MEAL1 = new UserMeal(MEAL1_ID + 1, LocalDateTime.of(2015, 1, 6, 0, 0), "омар", 1000);
    public static final UserMeal MEAL2 = new UserMeal(MEAL1_ID, LocalDateTime.of(2015, 1, 6, 0, 0), "анчоус", 500);

    public static UserMeal getCreated() {
        return new UserMeal(null, LocalDateTime.of(2015, 1, 8, 0, 0), "created meal", 1200);
    }

    public static UserMeal getUpdated() {
        UserMeal updated = new UserMeal(MEAL2);
        updated.setDescription("updated агчоус");
        return updated;
    }

    public static final ModelMatcher<UserMeal, String> MATCHER = new ModelMatcher<>(
            new Function<UserMeal, String>() {
                @Override
                public String apply(UserMeal meal) {
                    return meal.toString();
                }
            });

}


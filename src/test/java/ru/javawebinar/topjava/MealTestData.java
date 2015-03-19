package ru.javawebinar.topjava;

import ru.javawebinar.topjava.matcher.ModelMatcher;
import ru.javawebinar.topjava.model.BaseEntity;
import ru.javawebinar.topjava.model.UserMeal;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.function.Function;

/**
 * GKislin
 * 13.03.2015.
 */
public class MealTestData {


    private static final LoggerWrapper LOG = LoggerWrapper.get(UserTestData.class);

    public static final TestMeal MEAL1 = new TestMeal(BaseEntity.START_SEQ, LocalDateTime.parse("2015-03-19"), "омар", 1000);
    //public static final User ADMIN = new TestMeal(BaseEntity.START_SEQ + 1, "Admin", "admin@gmail.com", "admin", true, Role.ROLE_ADMIN);

    public static class TestMeal extends UserMeal {

        public TestMeal(UserMeal meal) {
            this(meal.getId(), meal.getDateTime(), meal.getDescription(), meal.getCalories());
        }

        public TestMeal(LocalDateTime dateTime, String description, int calories) {
            super(null, dateTime, description, calories);
        }

        public TestMeal(Integer id, LocalDateTime dateTime, String description, int calories) {
            super(id, dateTime, description, calories);
        }

        public UserMeal asUserMeal() {
            return new UserMeal(this);
        }

        @Override
        public String toString() {
            return "Meal (" +
                    "id=" + id +
                    ", description=" + description +
                    ", date=" + dateTime +
                    ", calories=" + calories +
                    ')';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TestMeal that = (TestMeal) o;

            return Objects.equals(this.description, that.description)
                    && Objects.equals(this.id, that.id)
                    && Objects.equals(this.dateTime, that.dateTime)
                    && Objects.equals(this.calories, that.calories);
            //&& Objects.equals(this.enabled, that.enabled);
//                    && Objects.equals(this.roles, that.roles);
        }


        public static final ModelMatcher<UserMeal, String> MATCHER = new ModelMatcher<>(
                new Function<UserMeal, String>() {
                    @Override
                    public String apply(UserMeal meal) {
                        return meal.toString();
                    }
                });

    }
}

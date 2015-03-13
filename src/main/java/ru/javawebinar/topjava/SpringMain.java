package ru.javawebinar.topjava;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.web.meal.UserMealRestController;
import ru.javawebinar.topjava.web.user.AdminUserRestController;

import java.util.Arrays;

/**
 * User: gkislin
 * Date: 22.08.2014
 */
public class SpringMain {
    public static void main(String[] args) {
        // java 7 Automatic resource management
        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml")) {
            System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");
            /*AdminUserRestController adminController = appCtx.getBean(AdminUserRestController.class);
            adminController.delete(7);
            adminController.getByMail("dummy");*/

            UserMealRestController userMealController = appCtx.getBean(UserMealRestController.class);
            userMealController.create("45", new UserMeal());
            userMealController.delete("5", "555");
            userMealController.get("5", "555");
        }
    }
}

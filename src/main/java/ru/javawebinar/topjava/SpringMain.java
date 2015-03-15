package ru.javawebinar.topjava;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.web.meal.UserMealRestController;

/**
 * User: gkislin
 * Date: 22.08.2014
 */
public class SpringMain {
    public static void main(String[] args) {
        // java 7 Automatic resource management
        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml")) {
           /* System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");
            AdminUserRestController adminController = appCtx.getBean(AdminUserRestController.class);
            adminController.delete(7);
            adminController.getByMail("dummy");*/

            UserMealRestController userMealController = appCtx.getBean(UserMealRestController.class);
            userMealController.create(new UserMeal());
            userMealController.delete(555);
            userMealController.get(555);
        }
    }
}

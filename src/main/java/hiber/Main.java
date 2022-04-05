package hiber;

import hiber.Service.UserService;
import hiber.config.MyConfig;
import hiber.models.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UserService userService = context.getBean(UserService.class);



//        userService.add(new User("name","lastName"));
//        userService.add(new User("name","lastName"));

//        User user = userService.get(1);
//        System.out.println(user);

        //System.out.println(userService.getAllUsers());

    }
}

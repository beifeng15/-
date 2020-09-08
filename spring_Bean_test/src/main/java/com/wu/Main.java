package com.wu;

import com.wu.config.UserConfig;
import com.wu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author Mr.Wu
 * @Date 2020/9/8 21:18
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext factory  = new AnnotationConfigApplicationContext(UserConfig.class);
        UserService userService = factory.getBean("userService", UserService.class);
        System.out.println(userService);
    }
}

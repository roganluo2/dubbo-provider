package com.my.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.Main;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
//        Main.main(args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/application.xml");
        context.start();
        System.in.read();
    }
}

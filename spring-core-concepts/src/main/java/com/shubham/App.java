package com.shubham;

import com.shubham.beans.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Hello hello = applicationContext.getBean("hello", Hello.class);
        hello.setName("Shubham");
        hello.sayHello();

        Hello hello1 = applicationContext.getBean("hello", Hello.class);

        System.out.println(hello.hashCode() + " " + hello1.hashCode());
    }

}

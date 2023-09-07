package com.how2java.test;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //create a container, load the configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        //get the bean from the container
        Category c = (Category) context.getBean("c");
        Product p = (Product) context.getBean("p");
        //print the name of the product
        System.out.println(c.getName());
        System.out.println(p.getName());
    }
}

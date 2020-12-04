package ru.egor.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());
        context.close();
    }
}

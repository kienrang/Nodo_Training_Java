package edu.java.spring_jee.unit1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        HelloClazz mybean = (HelloClazz) ctx.getBean("bean2");
//        HelloClazz mybean1 =  (HelloClazz) ctx.getBean("bean2");
//        mybean.printMessage();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.registerShutdownHook();
    }
}

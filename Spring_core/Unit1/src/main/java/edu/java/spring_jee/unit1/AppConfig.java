package edu.java.spring_jee.unit1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name="bean2")
    @Scope("singleton")
    public HelloClazz getHelloBean() {
        HelloClazz bean = new HelloClazz();
        bean.message = "Xin chào lớp học java";
        return bean;
    }

}

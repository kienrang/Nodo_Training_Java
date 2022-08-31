package com.java.spring;

import org.springframework.web.context.ContextLoaderListener;

public class AppContextLoaderListener extends ContextLoaderListener {
    @Override
    public void contextInitialized(javax.servlet.ServletContextEvent event) {
        System.out.println("----------->" + "Đã Khởi Tạo Ứng Dụng");
    }

    @Override
    public void contextDestroyed(javax.servlet.ServletContextEvent event) {
        System.out.println("----------->" + "Đã Hủy Ứng Dụng");
    }
}

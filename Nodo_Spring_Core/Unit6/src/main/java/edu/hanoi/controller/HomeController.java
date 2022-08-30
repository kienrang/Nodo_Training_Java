package edu.hanoi.controller;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
    private static final Logger LOGGER = Logger.getLogger(HomeController.class);

    @RequestMapping("/")
    ModelAndView home() {

        System.out.println("Da ttruy vap den day");
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message","Hello Java Clazz");
        LOGGER.info("Da truy cap den day");
        return mv;
    }



    @RequestMapping("/login-form")
    ModelAndView login(@RequestParam(value = "error",required = false)String error) {
        if (error != null) {
            ModelAndView mv = new ModelAndView("security/login");
            mv.addObject("error", "Tên đăng nhập hoặc mật khẩu không đúng");
            return mv;
        }
        return new ModelAndView("security/login");
    }

    @RequestMapping("/nguoi-dung")
    ModelAndView nguoiDung() {
        ModelAndView mv = new ModelAndView("index");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return mv.addObject("message","Hello User "+auth.getName());
    }
    @RequestMapping("/logout")
    String logout(HttpServletRequest request, HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth!=null){
            new SecurityContextLogoutHandler().logout(request,response,auth);
        }
        return "redirect:/";
    }
}

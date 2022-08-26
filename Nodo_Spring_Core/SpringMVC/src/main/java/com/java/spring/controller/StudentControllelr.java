package com.java.spring.controller;

import com.java.spring.student.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class StudentControllelr {
    @RequestMapping(value ="student/add", method = RequestMethod.GET)
    public ModelAndView add(@ModelAttribute Student student) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/students/student_form");
        return mv;
    }
    @RequestMapping(method = RequestMethod.POST, value = "student/save")
    public ModelAndView save(@Valid @ModelAttribute("command") Student student, BindingResult result) {
        ModelAndView mv;
        if(result.hasErrors()) {
            mv = new ModelAndView("student_form", "command", "student");
            mv.addObject("errors", result);
            return mv;
        }
        mv = new ModelAndView();
        Student st = new Student();
        st.setId(0);
        st.setName(student.getName());
        st.setAge(student.getAge());
        mv.addObject("student", st);
        mv.setViewName("/students/student_view");
        return mv;
    }
}

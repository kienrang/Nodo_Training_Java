package com.java.spring.controller;

import com.java.spring.dao.StudentDAO;
import com.java.spring.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping(value ="student/add", method = RequestMethod.GET)
    public ModelAndView add(@ModelAttribute Student student) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/students/student_form");
        return mv;
    }
    @RequestMapping(method = RequestMethod.POST, value = "student/save")
    public ModelAndView save(@Valid @ModelAttribute("command") Student student, BindingResult result) {

        ModelAndView mv = new ModelAndView();


       return mv;
    }

    @RequestMapping(method = RequestMethod.GET, value = "student/show")
    public ModelAndView show() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("lsSt", this.studentDAO.getAll());
        mv.setViewName("/students/student_list");
        return mv;
    }
}

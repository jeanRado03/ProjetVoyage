package com.example.testweb.controller;

import com.example.testweb.model.Employee;
import com.example.testweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/home")
    public String home(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "home";
    }
    @GetMapping("/employees")
    public String employees(Model model) {
        List<Employee> employees = employeeService.getAllEmp();
        model.addAttribute("employeelist",employees);
        return "employees";
    }
    @PostMapping("/saveEmployee")
    public ModelAndView saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmp(employee);
        return new ModelAndView("redirect:/");
    }
}

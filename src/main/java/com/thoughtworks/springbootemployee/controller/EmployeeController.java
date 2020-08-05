package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmployeeController {

    @Resource
    EmployeeService employeeService;

    @RequestMapping(value = "employees", method = RequestMethod.GET)
    public String getAllEmployees(Model model){
        List<Employee> employees = employeeService.getEmployee();
        model.addAttribute("employees",employees);
        return "employees";
    }
}
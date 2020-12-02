package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("employees")
public class EmployeeController {

  @Resource
  EmployeeService employeeService;

  @GetMapping
  public String getAllEmployees(Model model) {
    List<Employee> employees = employeeService.getEmployee();
    model.addAttribute("employees", employees);
    return "employees";
  }

  @PostMapping
  @ResponseBody
  public void addEmployee(@RequestBody Employee employee) {
    employeeService.addEmployee(employee);
  }

  @DeleteMapping("{id}")
  @ResponseBody
  public void deleteEmployee(@PathVariable int id) {
    employeeService.deleteEmployee(id);
  }

  @PutMapping("{id}")
  @ResponseBody
  public void updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
    employeeService.updateEmployee(id, employee);
  }
}
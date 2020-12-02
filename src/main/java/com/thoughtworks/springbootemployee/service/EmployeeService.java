package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployee();

    public void addEmployee(Employee employee);

    public void updateEmployee(int id, Employee employee);

    public void deleteEmployee(int id);
}

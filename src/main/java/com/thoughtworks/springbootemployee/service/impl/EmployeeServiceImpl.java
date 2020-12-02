package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.repository.EmployeeRepository;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {

@Resource
private EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        return this.employeeRepository.findAll();
    }

    @Override
    public void addEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
//        employee.setId(id);
        this.employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        this.employeeRepository.deleteById(id);
    }
}

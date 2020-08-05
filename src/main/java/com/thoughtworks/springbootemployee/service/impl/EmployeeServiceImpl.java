package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.repository.EmployeeRepository;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

@Resource
private EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        return this.employeeRepository.findAll();
    }
}

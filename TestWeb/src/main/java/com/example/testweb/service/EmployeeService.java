package com.example.testweb.service;

import com.example.testweb.model.Employee;
import com.example.testweb.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmp(Employee employee) {
        int sequence = employeeRepository.getNextVal();
        String id = employeeRepository.getSequence(3,"EMP",sequence);
        employee.setIdEmployer(id);
        employeeRepository.save(employee);
    }

    public List<Employee> getAllEmp() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getById(String id) {
        return employeeRepository.findById(id);
    }

}

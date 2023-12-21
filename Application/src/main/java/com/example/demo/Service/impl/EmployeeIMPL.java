package com.example.demo.Service.impl;
import com.example.demo.Dto.EmployeeDTO;
import com.example.demo.Entity.Employee;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeIMPL implements EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public String addEmployee(EmployeeDTO employeeDTO)
    {

        Employee employee = new Employee(
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getAddress(),
                employeeDTO.getMobile()
        );
        employeeRepo.save(employee);
        return employee.getEmployeename();
    }
}

package com.geekster.Employee_Address.Controlller;

import com.geekster.Employee_Address.Model.Employee;
import com.geekster.Employee_Address.Service.EmployeeService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/employees")
    public String addEmployees (@RequestBody List<Employee> employeeList){
        return employeeService.addEmployees(employeeList);
    }

    @GetMapping(value = "/employees")
    public List<Employee> getEmployees (@Nullable @RequestParam Long employeeId){
        return employeeService.getEmployees(employeeId);
    }

    @DeleteMapping(value = "/employee/{employeeId}")
    public String deleteEmployee (@PathVariable Long employeeId){
        return employeeService.deleteEmployee(employeeId);
    }

    @PutMapping(value = "/employee/{employeeId}")
    public String updateEmployee (@PathVariable Long employeeId , @RequestBody Employee employee){
        return employeeService.updateEmployee(employeeId , employee);
    }


}

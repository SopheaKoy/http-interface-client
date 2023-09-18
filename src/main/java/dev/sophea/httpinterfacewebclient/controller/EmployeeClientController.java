package dev.sophea.httpinterfacewebclient.controller;

import dev.sophea.httpinterfacewebclient.model.Employee;
import dev.sophea.httpinterfacewebclient.server.EmployeeClientServer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EmployeeClientController {

    private final EmployeeClientServer employeeClientServer;

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeClientServer.getAllEmployee();
    }

    @PostMapping("/employees")
    public Employee createEmployee(Employee employee){
        return employeeClientServer.createEmployee(employee);
    }
}

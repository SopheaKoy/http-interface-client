package dev.sophea.httpinterfacewebclient.server;

import dev.sophea.httpinterfacewebclient.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface EmployeeClientServer {

    @GetExchange("/employees")
    List<Employee> getAllEmployee();

    @PostExchange("/employees")
    Employee createEmployee(@RequestBody Employee employee);

}

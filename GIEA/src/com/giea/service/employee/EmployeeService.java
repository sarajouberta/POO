package com.giea.service.employee;

import com.giea.model.people.Employee;

public interface EmployeeService {
    Employee getEmployeeByEmail(String email);
}

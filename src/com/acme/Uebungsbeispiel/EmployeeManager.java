package com.acme.Uebungsbeispiel;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
        List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public double calculateCommission(Employee employee){
        return employee.strategy.calculateCommission(employee);
    }
}

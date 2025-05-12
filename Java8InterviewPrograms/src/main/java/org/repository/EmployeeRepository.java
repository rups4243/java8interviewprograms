package org.repository;

import org.dto.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(Employee.builder().name("John doe").age(32).
                salary(30000.00).department("IT").build());
        employeeList.add(Employee.builder().name("Sienna Liller").age(40).
                salary(40000.00).department("IT").build());
        employeeList.add(Employee.builder().name("John Malkovitch").age(60).
                salary(650000.00).department("Finance").build());
        employeeList.add(Employee.builder().name("Collin Farrel").age(50).
                salary(20000.00).department("Finance").build());
        employeeList.add(Employee.builder().name("Tom cruise").age(64).
                salary(90000.00).department("Development").build());
        employeeList.add(Employee.builder().name("Henry Cavill").age(34).
                salary(80000.00).department("Development").build());
        return employeeList;
    }

}

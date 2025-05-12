package org.example;

import org.dto.Employee;
import org.repository.EmployeeRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmploye {
    public static void main(String[] args) {
        List<Employee> employeeList =  new EmployeeRepository().findAll();
        System.out.println(employeeList);

        List<Employee> sortedEmployeeList =
                employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).
                        collect(Collectors.toList());
        System.out.println(sortedEmployeeList);

    }
}

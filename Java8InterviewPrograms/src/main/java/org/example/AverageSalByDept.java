package org.example;

import org.dto.Employee;
import org.repository.EmployeeRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalByDept {
    public static void main(String[] args) {
        List<Employee> employeeList =  new EmployeeRepository().findAll();
        System.out.println(employeeList);

        LinkedHashMap<String, Double> result  = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDepartment,
                        LinkedHashMap::new,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(result);
    }
}

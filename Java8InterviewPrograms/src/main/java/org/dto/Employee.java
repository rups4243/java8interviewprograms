package org.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Employee {
    private String name;
    private Integer age;
    private Double salary;
    private String department;
}

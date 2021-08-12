package com.example.Employeecrud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class EmployeeService{
    private static Map<Long, Employee> employees = new HashMap<>();
    private static Long index = 2L;
    static{
        Employee employee1 = new Employee(1L, "emp1", "emp1@gmail.com", 25, 200000L);
        Employee employee2 = new Employee(2L, "emp2", "emp2@gmail.com", 21, 27920L);
        Employee employee3 = new Employee(3L, "emp3", "emp3@gmail.com", 27, 48000L);
        employees.put(1L, employee1);
        employees.put(2L, employee2);
        employees.put(3L,employee3);
    }
    public static List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }
    public static Employee getEmployeeDetails(Long employeeId) {
        return employees.get(employeeId);
    }
    public static Employee addEmployee(Employee employee) {
        index += 1;
        employee.setId(index);
        Employee put = employees.put(index, employee);
        return employee;
    }
    public static Employee updateEmployee(Long employeeId, Employee employee) {
        employee.setId(employeeId);
        employees.put(employeeId, employee);
        return employee;
    }
    public static Employee deleteEmployee(Long employeeId) {
        return employees.remove(employeeId);
    }
}


package br.com.aab.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesGrouped {
    static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        Map<String, Float> salariesSummedByJobTitle = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.jobTitle)).entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey(),
                        entry -> entry.getValue().stream()
                                .map(employee -> employee.salary).reduce(0f, (acc, sal) -> acc + sal) ));

        System.out.println("<<< total salaries by job title >>>");
        salariesSummedByJobTitle.entrySet().forEach(System.out::println);

        Map<String, List<Employee>> employeesGroupedByJobTitle =
                employees.stream().collect(Collectors.groupingBy(e -> e.jobTitle));
        System.out.println("\n<<< employees grouped by job title >>>");
        employeesGroupedByJobTitle.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()
                        .stream()
                        .map(emp -> emp.name)
                        .collect(Collectors.toList())));

        Map<String, Float> salariesGroupedByJobTitle = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.jobTitle)).entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey(),
                        entry -> entry.getValue().stream()
                                .map(e -> e.salary)
                                .reduce(0f, (acc, sal) -> acc + sal) / entry.getValue().size()));
        System.out.println("\n<<< average salaries by job title >>>");
        salariesGroupedByJobTitle.entrySet().stream().forEach(System.out::println);
    }
}
package org.stream.intermediate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = List.of(

                new Employee(101L, "Arun", "IT", 85000, "Male", 26),
                new Employee(102L, "Nandhini", "HR", 60000, "Female", 25),
                new Employee(103L, "Ajay", "IT", 95000, "Male", 30),
                new Employee(104L, "Priya", "Finance", 75000, "Female", 28),
                new Employee(105L, "Rahul", "Sales", 55000, "Male", 27),
                new Employee(106L, "Sneha", "HR", 65000, "Female", 31),
                new Employee(107L, "David", "Finance", 80000, "Male", 35),
                new Employee(108L, "Karthik", "IT", 90000, "Male", 29),
                new Employee(109L, "Meena", "Sales", 58000, "Female", 24),
                new Employee(110L, "Vignesh", "IT", 88000, "Male", 32)
        );

        //Question 16 - Group Employees by Department

        Map<String, List<Employee>> groupByDepartment = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupByDepartment);

        //Question 17 - Count Employees in Each Department
        Map<String, Long> countEmployeesByDepartment = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countEmployeesByDepartment);

        //Question 18 - List Employee Names Department-wise
        Map<String, List<String>> listOfEmployeeName = employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName,
                                Collectors.toList())));
        System.out.println(listOfEmployeeName);

        //Question 19 - Find the Employee with the Highest Salary
        Employee employeeWithHighestSalary = employees
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
        System.out.println(employeeWithHighestSalary);

        employeeWithHighestSalary = employees
                .stream()
                .collect(Collectors
                        .maxBy(Comparator.comparingDouble(Employee::getSalary)))
                .orElse(null);
        System.out.println(employeeWithHighestSalary);

        //Question 20 - Find the Employee with the Lowest Salary
        Employee employeeWithLowestSalary = employees
                .stream()
                .min(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
        System.out.println(employeeWithLowestSalary);

        employeeWithLowestSalary = employees
                .stream()
                .collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)))
                .orElse(null);
        System.out.println(employeeWithLowestSalary);

        //Question 21 - Find the Average Salary of All Employees
        Double averageOfAllEmployeeSalary = employees
                .stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(averageOfAllEmployeeSalary);

        averageOfAllEmployeeSalary = employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println(averageOfAllEmployeeSalary);

        //Question 22 - Find the Total Salary of All Employees

        Double totalSalary = employees
                .stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(totalSalary);

        totalSalary = employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println(totalSalary);

        //Question 23 - Partition Employees by Salary
        Map<Boolean, List<Employee>>  groupEmployeeSalaryWith50000Threshold = employees
                .stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary()>=50000));
        System.out.println(groupEmployeeSalaryWith50000Threshold);

        //Question 24 - Join All Employee Names into a Comma-Separated String

        String employeeNameWithCommaSeparated= employees
                .stream()
                .map(Employee::getName)
                .collect(Collectors.joining(","));
        System.out.println(employeeNameWithCommaSeparated);

        //Question 25 - Convert List<Employee> into Map<EmployeeId, Employee>
        Map<Long, Employee> employeeIdMap = employees
                .stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity()));
        System.out.println(employeeIdMap);

        //Question 26 - Convert List<Employee> into Map<EmployeeName, Salary>
        Map<String, Double> employeeNameMap =employees
                .stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(employeeNameMap);

        //Question 27 - Find the Second Highest Salary
        Employee employeeWithSecondHighestSalary = employees
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(employeeWithSecondHighestSalary);

        //Question 28 - Find the Second Lowest Salary
        Employee employeeWithSecondLowestSalary = employees
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(employeeWithSecondLowestSalary);

        //Question 29 - Remove Duplicate Employees Based on Employee ID
        List<Employee> distinctEmployee = employees
                .stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity(), (existing, duplicate)->existing))
                .values()
                .stream()
                .toList();
        System.out.println(distinctEmployee);

        //Question 30 - Find duplicate elements in a list.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 5);

        List<Integer> duplicates = numbers
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(duplicates);

        //Question 31 - Find the frequency of each element in a list.
        List<String> fruits = Arrays.asList(
                "Apple", "Banana", "Apple", "Orange",
                "Banana", "Apple");

        Map<String, Long> freqMap = fruits.stream().
                                    collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freqMap);

        //Question 32 - Find the first non-repeated character in a string.
        String str = "aabbcdde";
        Character firstNonRepeatingCharacter = str
                .chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter( entry-> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(firstNonRepeatingCharacter);

        //Question 33 - Find the first repeated character in a string.
        String str2 = "abcdefbd";
        Character firstRepeatedCharacter = str2.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(firstRepeatedCharacter);

        Set<Character> charSet = new HashSet<>();
        firstRepeatedCharacter = str2.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> !charSet.add(ch))
                .findFirst()
                .orElse(null);
        System.out.println(firstRepeatedCharacter);


        //Question 34 - Count the occurrence of each character in a string.
        String str3 = "programming";
        Map<Character, Long> charOccuranceMap = str3.chars()
                .mapToObj(ch-> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charOccuranceMap);

        //Question 35 - Sort employees by salary in descending order.

        List<Employee> employeeListByHighestSalary = employees
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();
        System.out.println(employeeListByHighestSalary);

    }
}

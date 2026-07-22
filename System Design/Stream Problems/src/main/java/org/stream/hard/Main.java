package org.stream.hard;


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

        //Question 36.Find the top 3 highest-paid employees.
        List<Employee> top3EmployeeBySalary = employees
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .toList();
        System.out.println(top3EmployeeBySalary);

        //Question 37.Find the top N highest numbers from a list.
        List<Integer> numbers = Arrays.asList(10, 50, 20, 80, 40, 90, 60, 30);
        int n=5;
        List<Integer> topNHighestNumbers = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(n)
                .toList();
        System.out.println(topNHighestNumbers);

        //Question 38.Demonstrate pagination using skip() and limit().
        List<Integer> numbers2 = Arrays.asList(
                1,2,3,4,5,6,7,8,9,10,
                11,12,13,14,15,16,17,18,19,20);
        int pageNumber = 2;
        int pageSize = 5;
        List<Integer> pagedValues = numbers2
                .stream()
                .skip((pageNumber-1)*pageSize)
                .limit(pageSize)
                .toList();
        System.out.println(pagedValues);

        //Question 39.Flatten a List<List<Integer>> into a single list using flatMap().
        List<List<Integer>> numbers3 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenList = numbers3
                .stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(flattenList);

        //Question 40.Flatten a List<List<String>> into a single list.
        List<List<String>> names = Arrays.asList(
                Arrays.asList("John", "David"),
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Emma", "Chris")
        );

        List<String> flattenNames = names
                .stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(flattenNames);

        //Question 41.Group employees by department and then by gender (nested grouping).
        Map<String, Map<String, List<Employee>>> groupEmployeeWithDepartmentAndGenderMap = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));
        System.out.println(groupEmployeeWithDepartmentAndGenderMap);

        //Question 42.Group employees by department and find the highest-paid employee in each department.

        Map<String, Optional<Employee>> employeeWithHighestSalaryInEachDepartment= employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(employeeWithHighestSalaryInEachDepartment);

        //Question 43. Group employees by department and calculate the average salary.

        Map<String, Double> averageSalaryOfEachDepartment = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryOfEachDepartment);

        //Question 44.Sort employees by salary descending and name ascending (multiple comparators).
        List<Employee> sortBySalaryDescNameAsc= employees
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName))
                .toList();
        System.out.println(sortBySalaryDescNameAsc);

        //Question 45.Find the department with the highest average salary.
        Map.Entry<String, Double> departmentWithHighestSalary = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println(departmentWithHighestSalary);

        //Question 46.Find employees whose salary is above the department's average salary.

        Map<String, Double> averageOfEachDepartment = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        List<Employee> employeesWithSalaryMoreThanAvg = employees
                .stream()
                .filter(employee -> employee.getSalary() > averageOfEachDepartment.get(employee.getDepartment()))
                .toList();
        System.out.println(employeesWithSalaryMoreThanAvg);

        //Question 47.Find the longest string in a list.
        List<String> words = Arrays.asList(
                "Java",
                "Spring",
                "Microservices",
                "Docker",
                "Kafka"
        );

        String ans = words.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(ans);

        //Question 48.Find the most frequently occurring element in a list.
        List<Integer> numbers4 = Arrays.asList(
                1, 2, 3, 2, 4, 2, 5, 3, 3, 3, 6
        );
        Map.Entry<Integer, Long> mostFrequentElementPair =  numbers4
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println(mostFrequentElementPair);

        Integer mostFrequentElement =  numbers4
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(mostFrequentElement);

        //Question 49.Find the intersection of two lists using Streams.

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        Set<Integer> set = new HashSet<>(list1);

        List<Integer> intersectionList = list2
                .stream()
                .filter(set::contains)
                .toList();
        System.out.println(intersectionList);

        // Question 50. Complex Pipeline Problem
        //Given a list of employees, perform the following operations:
            //Group employees by department.
            //Ignore employees with salary less than 50,000.
            //Within each department:
                //Sort employees by salary (descending).
                //If salaries are equal, sort by name (ascending).
            //Keep only the top 3 employees from each department.
            //Return only the employee names.

        Map<String, List<String>> result = employees
                .stream()
                .filter(emp->emp.getSalary()>=50000)
                .collect(Collectors.groupingBy(Employee::getDepartment,
                            Collectors.collectingAndThen(
                                    Collectors.toList(),
                                    empList-> empList.stream()
                                            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName))
                                            .limit(3)
                                            .map(Employee::getName)
                                            .toList()
                            )
                        ));
    }
}

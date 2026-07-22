package org.stream.basic;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Filter all even numbers from a list.
        List<Integer> numbers = List.of(12, 7, 4, 19, 22, 35, 18, 5, 10);

        List<Integer> evenList = numbers.stream().filter(e-> e%2==0).toList();
        System.out.println(evenList);

        //Question 2: Filter all odd numbers from a list.
        List<Integer> values = List.of(25, 18, 7, 40, 13, 22, 9, 16, 31, 28);

        List<Integer> oddList = values.stream().filter(e-> e%2!=0).toList();
        System.out.println(oddList);

        //Question 3 - Filter Strings Starting with a Specific Character
        List<String> names = List.of(
                "Arun",
                "Nandhini",
                "Anbil",
                "Rengasamy",
                "Ajay",
                "David",
                "Akhil",
                "Ramesh"
        );

        List<String> nameList = names.stream().filter(e -> e.startsWith("A")).toList();
        System.out.println(nameList);

        //Question 4 - Convert All Strings to Uppercase
        List<String> cities = List.of(
                "chennai",
                "bangalore",
                "hyderabad",
                "mumbai",
                "delhi",
                "pune"
        );

        List<String> citiesToUpperList = cities.stream().map(String::toUpperCase).toList();
        System.out.println(citiesToUpperList);

        //Question 5 - Convert All Strings to Lowercase
        List<String> countries = List.of(
                "INDIA",
                "USA",
                "JAPAN",
                "GERMANY",
                "AUSTRALIA",
                "CANADA"
        );

        List<String> citiesToLowerList = countries.stream().map(String::toLowerCase).toList();
        System.out.println(citiesToLowerList);

        //Question 6 - Square Each Number in a List
        List<Integer> scores = List.of(2, 5, 7, 10, 12, 15, 18);
        List<Integer> squareofScoreList = scores.stream().map( e-> e*e).toList();
        System.out.println(squareofScoreList);

        //Question 7 - Remove Duplicate Elements from a List
        List<Integer> employeeIds = List.of(
                101, 105, 102, 101, 108, 105, 109, 102, 110, 108
        );

        List<Integer> distinctEmployeeIdList = employeeIds.stream().distinct().toList();
        System.out.println(distinctEmployeeIdList);

        //Question 8 - Sort a List in Ascending Order
        List<Integer> marks = List.of(
                78, 45, 92, 61, 39, 84, 55, 100, 67
        );

        List<Integer> sortedMarks = marks.stream().sorted().toList();
        System.out.println(sortedMarks);

        //Question 9 - Sort a List in Descending Order
        List<Integer> ages = List.of(
                25, 42, 18, 36, 55, 29, 61, 40, 33
        );

        List<Integer> descendingSortedAges = ages.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(descendingSortedAges);

        //Question 10: Find the first element in a stream
        List<String> technologies = List.of(
                "Java",
                "Spring Boot",
                "Hibernate",
                "MySQL",
                "Docker",
                "Kubernetes"
        );

        String firstElement = technologies.stream().findFirst().orElse(null);
        System.out.println(firstElement);

        //Question 11 - Find Any Element
        List<String> frameworks = List.of(
                "Spring Boot",
                "Hibernate",
                "Kafka",
                "Redis",
                "Docker",
                "Kubernetes"
        );

        String findAnyElement = frameworks.parallelStream().findAny().orElse(null);
        System.out.println(findAnyElement);

        //Question 12 - Count the Number of Elements
        List<Integer> prices = List.of(
                120, 450, 300, 180, 750, 620, 410
        );

        Long count = prices.stream().count();
        System.out.println(count);

        //Question 13 - Check if Any Element Matches a Condition
        List<Integer> quantities = List.of(
                15, 28, 45, 67, 89, 120, 34, 56
        );

        boolean matchesConditionForAnyElement = quantities.stream().anyMatch(e -> e>45);
        System.out.println(matchesConditionForAnyElement);

        //Question 14 - Check if All Elements Match a Condition
        List<Integer> salaries = List.of(
                15, 28, 45, 67, 89, 120, 34, 56
        );

        boolean allSalariesAreGreaterThan10 = salaries.stream().allMatch(salary-> salary>10);
        System.out.println(allSalariesAreGreaterThan10);

        //Question 15 - Check if No Elements Match a Condition
        List<Integer> temperatures = List.of(
                25, 18, 30, 42, 15, 28, 36
        );

        boolean isAllOrPositive = temperatures.stream().noneMatch(temp-> temp<0);
        System.out.println(isAllOrPositive);
    }
}

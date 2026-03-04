package java8features.method_reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestName {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"John",40000),
                new Employee(2,"Alexandra",75000),
                new Employee(3,"Tom",50000)
        );

        employeeList.stream()
                .max(Comparator.comparing(
                        Employee::getName,
                        Comparator.comparingInt(String::length)

                )).ifPresent(e -> System.out.println(e.name));
    }

}

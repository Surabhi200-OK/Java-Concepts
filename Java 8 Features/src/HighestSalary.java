import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestSalary {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"John",40000),
                new Employee(2,"Alex",75000),
                new Employee(3,"Zara",50000)
        );

        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());

        employeeList.forEach(e -> System.out.println(e.name+":"+e.salary));
    }
}

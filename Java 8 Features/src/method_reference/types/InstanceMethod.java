package method_reference.types;

import java.util.Arrays;
import java.util.List;

public class InstanceMethod {


    //Reference to an instance method of arbitrary object
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java","Microservice","SpringBoot");

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

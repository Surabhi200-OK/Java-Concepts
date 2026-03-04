package java8features.method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Java","SpringBoot","Microservices","REST API");

        data.forEach(MethodReference::print);

    }
}

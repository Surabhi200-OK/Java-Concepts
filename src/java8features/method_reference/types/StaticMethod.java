package java8features.method_reference.types;

import java.util.Arrays;
import java.util.List;

public class StaticMethod {

    //Reference to static method
    public static void square(int n){
        System.out.println(n * n);
    }
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,6,8,10);

        list.forEach(StaticMethod::square);
    }
}

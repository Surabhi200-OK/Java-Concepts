package types;

import java.util.Arrays;
import java.util.List;

public class Printer {

    //Reference to an instance method of specific object
    public void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {

        Printer p = new Printer();

        List<String> data = Arrays.asList("Pen","Pencil","Rubber");

        data.forEach(p::print);

    }
}

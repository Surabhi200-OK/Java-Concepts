package types;

import java.util.function.Supplier;

public class Student {

    //Reference to a constructor

    Student(){
        System.out.println("Student Object Created");
    }

    public static void main(String[] args) {

        Supplier<Student> supplier = Student::new;
        supplier.get();
    }
}

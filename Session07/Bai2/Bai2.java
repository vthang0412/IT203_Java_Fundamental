package Session07.Bai2;

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class Bai2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a); // vẫn là 10
        System.out.println("b = " + b); // 20

        // Bien tham chieu
        Student s1 = new Student("Thang");
        Student s2 = s1; // sao chép dia chi

        s2.name = "Gen Z";

        System.out.println("\nReference:");
        System.out.println("s1.name = " + s1.name); // Gen Z
        System.out.println("s2.name = " + s2.name); // Gen Z
    }
}
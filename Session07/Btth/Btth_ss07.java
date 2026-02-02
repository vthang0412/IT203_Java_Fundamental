package Session07.Btth;

public class Btth_ss07 {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyen Van A");
        Student s2 = new Student("SV002", "Tran Thi B");

        s1.displayInfo();
        s2.displayInfo();

        s1.setName("Le Van C");
        System.out.println(s1.getName());

        Student.showTotalStudent();
    }
}

class Student {
    private String id;
    private String name;

    static int studentCount = 0;
    static final String SCHOOL_NAME = "ABC University";

    Student(String id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    String getId() {
        return id;
    }

    String getName() {
        return name;
    }

    void setId(String id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("school: " + SCHOOL_NAME);
        System.out.println();
    }

    static void showTotalStudent() {
        System.out.println("total students: " + studentCount);
    }
}
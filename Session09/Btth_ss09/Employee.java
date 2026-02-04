package Session09.Btth_ss09;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Employee {
    private String id;
    private String name;
    private int age;
    private double credit;
    private double baseSalary;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, double credit, double baseSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.credit = credit;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getCredit() {
        return credit;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(Scanner sc) {
        System.out.print("Nhap id: ");
        id = sc.nextLine();

        System.out.print("Nhap ten: ");
        name = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap he so luong: ");
        credit = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap luong co ban: ");
        baseSalary = Double.parseDouble(sc.nextLine());
    }

    public void displayData() {
        NumberFormat nf = NumberFormat.getInstance(new Locale("vi", "VN"));
        System.out.println("ID: " + id +
                " | Ten: " + name +
                " | Tuoi: " + age +
                " | He so: " + credit +
                " | Luong CB: " + nf.format(baseSalary) +
                " | Luong: " + nf.format(salary));
    }

    public void calcSalary() {
        salary = credit * baseSalary;
    }
}
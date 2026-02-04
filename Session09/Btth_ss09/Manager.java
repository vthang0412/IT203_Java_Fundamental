package Session09.Btth_ss09;

import java.util.Scanner;

class Manager extends Employee {
    private String position;
    private String department;

    public Manager() {
    }

    public Manager(String position, String department) {
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }
    public String getDepartment() {
        return department;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void inputManager(Scanner sc) {
        inputData(sc);

        System.out.print("Nhap vi tri: ");
        position = sc.nextLine();

        System.out.print("Nhap phong ban: ");
        department = sc.nextLine();
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Vi tri: " + position + " | Phong ban: " + department);
    }

    @Override
    public void calcSalary() {
        setSalary(getCredit() * getBaseSalary() * 1.2);
    }
}
package Session09.Btth_ss09;

import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[100];
        int current = 0;
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Them quan ly");
            System.out.println("3. Tinh luong");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Sap xep luong giam dan");
            System.out.println("6. Dem nhan vien va quan ly");
            System.out.println("7. Tim theo ten");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhap so luong: ");
                    int n1 = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n1; i++) {
                        Employee e = new Employee();
                        e.inputData(sc);
                        arr[current++] = e;
                    }
                    break;

                case 2:
                    System.out.print("Nhap so luong: ");
                    int n2 = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n2; i++) {
                        Manager m = new Manager();
                        m.inputManager(sc);
                        arr[current++] = m;
                    }
                    break;

                case 3:
                    for (int i = 0; i < current; i++) {
                        arr[i].calcSalary();
                    }
                    System.out.println("Da tinh luong");
                    break;

                case 4:
                    for (int i = 0; i < current; i++) {
                        arr[i].displayData();
                    }
                    break;

                case 5:
                    for (int i = 0; i < current - 1; i++) {
                        for (int j = i + 1; j < current; j++) {
                            if (arr[i].getSalary() < arr[j].getSalary()) {
                                Employee temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                    System.out.println("Da sap xep");
                    break;

                case 6:
                    int emp = 0, man = 0;
                    for (int i = 0; i < current; i++) {
                        if (arr[i] instanceof Manager) man++;
                        else emp++;
                    }
                    System.out.println("So nhan vien: " + emp);
                    System.out.println("So quan ly: " + man);
                    break;

                case 7:
                    System.out.print("Nhap ten can tim: ");
                    String key = sc.nextLine().toLowerCase();
                    for (int i = 0; i < current; i++) {
                        if (arr[i].getName().toLowerCase().contains(key)) {
                            arr[i].displayData();
                        }
                    }
                    break;
            }

        } while (choice != 0);
    }
}
package Session03;

import java.util.Scanner;

public class Btth_ss03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        int[] ids = new int[MAX];
        String[] titles = new String[MAX];
        int[] quantities = new int[MAX];
        int current = 2;

        ids[0] = 101;
        titles[0] = "lap trinh java";
        quantities[0] = 10;

        ids[1] = 102;
        titles[1] = "co so du lieu";
        quantities[1] = 5;

        do {
            System.out.println("\n1. xem danh sach");
            System.out.println("2. them sach moi");
            System.out.println("3. cap nhat so luong");
            System.out.println("4. xoa sach");
            System.out.println("5. tim kiem");
            System.out.println("6. sap xep theo so luong giam dan");
            System.out.println("7. thoat");
            System.out.print("chon: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    if (current == 0) {
                        System.out.println("danh sach rong");
                    } else {
                        System.out.println("ma | ten | so luong");
                        for (int i = 0; i < current; i++) {
                            System.out.println(ids[i] + " | " + titles[i] + " | " + quantities[i]);
                        }
                    }
                    break;

                case 2:
                    if (current == MAX) {
                        System.out.println("mang da day");
                        break;
                    }
                    System.out.print("nhap ma sach: ");
                    int newId = Integer.parseInt(sc.nextLine());
                    boolean exist = false;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == newId) {
                            exist = true;
                            break;
                        }
                    }
                    if (exist) {
                        System.out.println("ma sach da ton tai");
                        break;
                    }
                    System.out.print("nhap ten sach: ");
                    String newTitle = sc.nextLine();
                    System.out.print("nhap so luong: ");
                    int newQty = Integer.parseInt(sc.nextLine());

                    ids[current] = newId;
                    titles[current] = newTitle;
                    quantities[current] = newQty;
                    current++;
                    System.out.println("them thanh cong");
                    break;

                case 3:
                    System.out.print("nhap ma sach: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    int pos = -1;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == updateId) {
                            pos = i;
                            break;
                        }
                    }
                    if (pos == -1) {
                        System.out.println("khong tim thay sach");
                        break;
                    }
                    System.out.print("nhap so luong moi: ");
                    quantities[pos] = Integer.parseInt(sc.nextLine());
                    System.out.println("cap nhat thanh cong");
                    break;

                case 4:
                    System.out.print("nhap ma sach: ");
                    int delId = Integer.parseInt(sc.nextLine());
                    int index = -1;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == delId) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("khong tim thay sach");
                        break;
                    }
                    for (int i = index; i < current - 1; i++) {
                        ids[i] = ids[i + 1];
                        titles[i] = titles[i + 1];
                        quantities[i] = quantities[i + 1];
                    }
                    current--;
                    System.out.println("xoa thanh cong");
                    break;

                case 5:
                    System.out.print("nhap tu khoa: ");
                    String key = sc.nextLine().toLowerCase();
                    boolean found = false;
                    for (int i = 0; i < current; i++) {
                        if (titles[i].toLowerCase().contains(key)) {
                            System.out.println(ids[i] + " | " + titles[i] + " | " + quantities[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("khong co ket qua");
                    }
                    break;

                case 6:
                    for (int i = 0; i < current - 1; i++) {
                        for (int j = 0; j < current - 1 - i; j++) {
                            if (quantities[j] < quantities[j + 1]) {
                                int tq = quantities[j];
                                quantities[j] = quantities[j + 1];
                                quantities[j + 1] = tq;

                                int tid = ids[j];
                                ids[j] = ids[j + 1];
                                ids[j + 1] = tid;

                                String tt = titles[j];
                                titles[j] = titles[j + 1];
                                titles[j + 1] = tt;
                            }
                        }
                    }
                    System.out.println("sap xep thanh cong");
                    break;

                case 7:
                    System.out.println("da thoat");
                    return;

                default:
                    System.out.println("lua chon khong hop le");
            }

        } while (true);
    }
}

package Session02;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = -1;
        int tong = 0;
        int dem = 0;

        for (int i = 2; i <= 8; i++) {
            if (i == 8) {
                System.out.print("Nhap luot muon ngay Chu Nhat: ");
            } else {
                System.out.print("Nhap luot muon ngay Thu " + i + ": ");
            }

            int luot = sc.nextInt();

            if (luot == 0) {
                continue;
            }

            if (dem == 0) {
                max = luot;
                min = luot;
            } else {
                if (luot > max) max = luot;
                if (luot < min) min = luot;
            }

            tong += luot;
            dem++;
        }

        System.out.println();
        System.out.println("--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + (double) tong / dem);
    }
}

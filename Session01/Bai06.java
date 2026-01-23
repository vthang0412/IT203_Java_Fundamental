package Session01;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu tu cua sach trong he thong: ");
        int stt = sc.nextInt();

        int ke = (stt - 1) / 25 + 1;
        int viTri = (stt - 1) % 25 + 1;

        String khuVuc = ke <= 10 ? "Khu Can (Gan cua)" : "Khu Vien";

        System.out.println();
        System.out.println("--- THONG TIN DINH VI ---");
        System.out.println("Sach so: " + stt);
        System.out.println("Dia chi: Ke " + ke + " - Vi tri " + viTri);
        System.out.println("Phan khu: " + khuVuc);
    }
}

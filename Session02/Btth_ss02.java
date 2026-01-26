package Session02;

import java.util.Scanner;

public class Btth_ss02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- QUAN LY THU VIEN ---");
            System.out.println("1. Tinh tien phat tra sach");
            System.out.println("2. Dang ky the muon sach VIP");
            System.out.println("3. Thong ke sach nhap kho");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong sach tra: ");
                    int n = sc.nextInt();
                    int tongTien = 0;

                    for (int i = 1; i <= n; i++) {
                        System.out.print("Nhap so ngay tre cua cuon " + i + ": ");
                        int ngayTre = sc.nextInt();

                        if (ngayTre > 0 && ngayTre <= 5) {
                            tongTien += ngayTre * 2000;
                        } else if (ngayTre > 5) {
                            tongTien += 5 * 2000 + (ngayTre - 5) * 5000;
                        }
                    }

                    System.out.println("Tong tien phat: " + tongTien + " VND");
                    break;
                case 2:
                    System.out.print("Nhap tuoi: ");
                    int tuoi = sc.nextInt();
                    System.out.print("Nhap so sach da muon trong thang: ");
                    int soSach = sc.nextInt();
                    System.out.print("La sinh vien co the uu tien? (1-co, 0-khong): ");
                    int uuTien = sc.nextInt();

                    if ((tuoi >= 18 && soSach >= 10) || uuTien == 1) {
                        System.out.println("Du tieu chuan nang cap VIP");
                    } else {
                        System.out.println("Chua du tieu chuan");
                    }
                    break;
                case 3:
                    int dem = 0;
                    int ma;
                    do {
                        System.out.print("Nhap ma sach moi: ");
                        ma = sc.nextInt();

                        if (ma < 0) {
                            continue;
                        }
                        if (ma == 0) {
                            break;
                        }
                        dem++;
                    } while (true);

                    System.out.println("Tong so sach hop le da nhap: " + dem);
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
    }
}

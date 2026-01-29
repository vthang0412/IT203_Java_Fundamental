package Session05;

import java.util.Scanner;

public class Btth_ss5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("===== MENU CHUONG TRINH =====");
            System.out.println("1. Tim cap so co tong bang K (Two Sum)");
            System.out.println("2. Don so 0 ve cuoi mang (Move Zeroes)");
            System.out.println("3. Kiem tra chuoi doi xung (Palindrome)");
            System.out.println("4. Dao nguoc cac tu trong chuoi");
            System.out.println("5. Kiem tra so hanh phuc");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    twoSum();
                    break;
                case 2:
                    moveZeroes();
                    break;
                case 3:
                    validPalindrome();
                    break;
                case 4:
                    reverseWords();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 0);
    }

    static void twoSum() {
        System.out.print("Nhap so phan tu: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + i + ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Nhap gia tri K: ");
        int k = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("Tim thay tai chi so: " + i + " va " + j);
                    return;
                }
            }
        }
        System.out.println("Khong tim thay cap so phu hop");
    }

    static void moveZeroes() {
        System.out.print("Nhap so phan tu: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + i + ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }

        System.out.print("Mang sau khi xu ly: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void validPalindrome() {
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;
        boolean ok = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                ok = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Ket qua: " + ok);
    }

    static void reverseWords() {
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine().trim();

        if (s.length() == 0) {
            System.out.println("Chuoi rong");
            return;
        }

        String[] words = s.split("\\s+");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) result += " ";
        }

        System.out.println("Chuoi sau khi dao: " + result);
    }

    static void happyNumber() {
        System.out.print("Nhap so n: ");
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;

        while (n != 1 && count < 100) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
            count++;
        }

        if (n == 1) {
            System.out.println("Ket qua: true");
        } else {
            System.out.println("Ket qua: false");
        }
    }
}

package Session15.Btth_ss15;

import java.util.*;

public class Main implements IManagement {

    private LinkedList<Patient> waitingQueue = new LinkedList<>();
    private List<Patient> treatedList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("1. Benh nhan thuong");
        System.out.println("2. Benh nhan cap cuu");
        int choice = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        System.out.print("Nhap Ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap Tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap Tinh trang: ");
        String condition = sc.nextLine();

        if(choice == 2) {
            System.out.print("Nhap muc do uu tien: ");
            int priority = Integer.parseInt(sc.nextLine());
            waitingQueue.addFirst(new EmergencyPatient(id, name, age, condition, priority));
        } else {
            waitingQueue.addLast(new Patient(id, name, age, condition));
        }

        System.out.println("Da dang ky kham.");
    }

    public void callPatient() {
        if(waitingQueue.isEmpty()) {
            System.out.println("Khong co benh nhan.");
            return;
        }

        Patient p = waitingQueue.poll();
        System.out.println("Dang kham:");
        p.showInfo();

        System.out.print("Nhap chan doan/thuoc: ");
        String record = sc.nextLine();
        p.addHistory(record);

        treatedList.add(p);
        System.out.println("Da hoan tat kham.");
    }

    @Override
    public void display() {
        if(waitingQueue.isEmpty()) {
            System.out.println("Hang doi rong.");
            return;
        }

        for(Patient p : waitingQueue) {
            p.showInfo();
        }
    }

    @Override
    public void search() {
        System.out.print("Nhap ID hoac Ten: ");
        String key = sc.nextLine();

        for(Patient p : waitingQueue) {
            if(p.getId().equalsIgnoreCase(key) ||
                    p.getFullName().equalsIgnoreCase(key)) {
                p.showInfo();
                return;
            }
        }

        for(Patient p : treatedList) {
            if(p.getId().equalsIgnoreCase(key) ||
                    p.getFullName().equalsIgnoreCase(key)) {
                p.showInfo();
                return;
            }
        }

        System.out.println("Khong tim thay.");
    }

    @Override
    public void sort() {
        waitingQueue.sort((a, b) -> a.getAge() - b.getAge());
        System.out.println("Da sap xep theo tuoi.");
    }

    public void viewHistory() {
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();

        for(Patient p : treatedList) {
            if(p.getId().equalsIgnoreCase(id)) {
                p.viewHistory();
                return;
            }
        }

        System.out.println("Benh nhan chua co lich su.");
    }

    public static void main(String[] args) {
        Main app = new Main();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Dang ky kham");
            System.out.println("2. Goi kham");
            System.out.println("3. Xem hang doi");
            System.out.println("4. Tim kiem");
            System.out.println("5. Sap xep theo tuoi");
            System.out.println("6. Xem lich su dieu tri");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1: app.add();
                break;
                case 2: app.callPatient();
                break;
                case 3: app.display();
                break;
                case 4: app.search();
                break;
                case 5: app.sort();
                break;
                case 6: app.viewHistory();
                break;
                case 0: System.exit(0);
                default: System.out.println("Lua chon khong hop le.");
            }
        }
    }
}

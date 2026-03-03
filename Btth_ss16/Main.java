package Btth_ss16;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E01", "Laptop", 15000000, 24));
        repo.add(new ElectronicProduct("E02", "Tivi", 10000000, 12));
        repo.add(new FoodProduct("F01", "Sua", 20000, 10));
        repo.add(new FoodProduct("F02", "Banh", 50000, 20));

        for (Product p : repo.findAll()) {
            if (p != null) {
                p.display();
                System.out.println("Thanh tien: " + p.calculateFinalPrice());
            }
        }

        Product found = repo.findById("E01");
        if (found != null) {
            found.display();
            System.out.println("Thanh tien: " + found.calculateFinalPrice());
        } else {
            System.out.println("Khong tim thay");
        }

        List<Product> sortedList = new ArrayList<>(repo.findAll());
        Collections.sort(sortedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        for (Product p : sortedList) {
            System.out.println(p.getId() + " - " + p.getPrice());
        }

        Map<String, Integer> stats = new HashMap<>();
        stats.put("Electronic", 0);
        stats.put("Food", 0);

        for (Product p : repo.findAll()) {
            if (p instanceof ElectronicProduct) {
                stats.put("Electronic", stats.get("Electronic") + 1);
            } else if (p instanceof FoodProduct) {
                stats.put("Food", stats.get("Food") + 1);
            }
        }

        for (String key : stats.keySet()) {
            System.out.println(key + ": " + stats.get(key));
        }
    }
}

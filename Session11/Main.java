package Session11;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("01","Bac siu",30000,true);
        drinks[1] = new FruitJuice("02","Nuoc cam",40000,10);
        drinks[2] = null;

        for (Drink d : drinks) {
            if (d != null) {
                d.displayInfo();

                System.out.println("Thanh tien " + d.calculatePrice());

//                if (d instanceof IMixable) {
//                    void mix();
//                }

            }
        }
    }
}

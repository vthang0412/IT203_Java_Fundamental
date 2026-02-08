package Session10.Bai6;

class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void display() {
        System.out.println(name + " - " + price);
    }
}
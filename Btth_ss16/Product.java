package Btth_ss16;

abstract class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double calculateFinalPrice();
    public void display(){
        System.out.println("Ma:" +id);
        System.out.println("Ten sp:" +name);
        System.out.println("Gia sp:" +price);
    }
}

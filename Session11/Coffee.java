package Session11;

public class Coffee extends Drink {
    public boolean hasMilk;

   public Coffee(String id,String name,double price,Boolean hasMilk) {
       super(id,name,price);
       this.hasMilk=hasMilk;
   }
   @Override
    public double calculatePrice() {
       if(hasMilk){
           return price + 5000;
       }
       return price;
   }
   @Override
    public void displayInfo() {
       super.displayInfo();
       if(hasMilk){
           System.out.println("Co sua");
       }else {
           System.out.println("Den da");
       }
   }
}

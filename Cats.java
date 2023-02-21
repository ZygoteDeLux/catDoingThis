 public class Cats {

     public int teeth = 4;
     public int eyes = 2;
     public String name = "cat";
     public String profit = "alot";

     public static void main(String[] args) {

         Cats cat1 = new Cats();
         if (cat1.name == "cat") {
             cat1.eat();
         }

         Cats cat2 = cat1;
         if(cat2 == cat1){
             cat2.sleep();
             cat1.sleep();
             cat1.getProfit();
         }

     }

     public void eat(){
         System.out.println("im now eating");

     }

     public void sleep(){
         System.out.println("Im now sleeping");

     }

     public void fly(){
         System.out.println("im now flying");

     }

     public void swim(){
         System.out.println("im now swimming");

     }

     public void hunt(){
         System.out.println("im now hunting");

     }

     public void makeCoffe(){
         System.out.println("im making coffe");

     }


     public String getProfit(){
        return profit;
     }

 }


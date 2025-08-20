package levin27;
public class Car {
 
  String model;
  String color;

 public Car(String model, String color) {
     this.model = model;
     this.color = color;
   
 }

 public void start() {
    
         System.out.println("Car started(" + model + ", "+ color + ")");
       
 }

 public void stop() {
     
         System.out.println( " Car stopped.(" +model +","+ color +")" );
     }
 
 public static void main(String[] args) {
     Car myCar = new Car("Tesla", "Red");
     Car myCar1 = new Car("BMW", "Black");
     Car myCar2 = new Car("", "");
     

     myCar.start();
     myCar1.start();
     myCar2.start();
     myCar.stop();
     
 }
}

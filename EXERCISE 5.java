class Shape {
void calculateArea() {
   
}
}

class Circle extends Shape {
 @Override
void calculateArea() {
	 
	 double radius = 10;
	 System.out.println(Math.PI*radius*radius);
 }
}

class Rectangle extends Shape {
	double width = 15;
    double height = 20;
 
 

 @Override
 void calculateArea() {
	 System.out.println( width * height);
 }
}

public class ShapeDemo {
 public static void main(String[] args) {
     Shape circle = new Circle();
     Shape rectangle = new Rectangle();
     circle.calculateArea();
     rectangle.calculateArea();
     
 }
}

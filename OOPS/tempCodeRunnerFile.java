abstract class Shape{
    abstract void Circumference();
    abstract void Area();
    abstract void length();
}
  class Circle extends Shape{
    void Circumference(){
        System.out.println("Circle");
        
    }
    void Area(){
        System.out.println("Area");
    }

    void length(){
        System.out.println("Hello");
    }
    
}

// abstract class Rectangle extends Shape{
//     void Area(){
//         System.out.println("Rectangle");
//     }
// }

// abstract class Rhombus extends Shape{
//     void length(){
//         System.out.println("Rhombus");
//     }
//      void show(){
//         System.out.println("Hello");
//      }
// }

// class Result extends Rhombus{
//      void show(){

//         System.out.println("Hello");
//     }

// }

public class Abstract1 {
public static void main(String[] args) {
 Circle k=new Circle();
 k.Area();
 k.Circumference();
 k.length();
}
    
}
abstract class A{
    A(){System.out.println("Hello");};
}

class B extends A{
   B(){
    super();
   }
}

public class Abstract1 {
public static void main(String[] args) {
    new B();
    
}
    
}
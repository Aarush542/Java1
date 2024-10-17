interface A{
    default void show(){
        System.out.println("Hello");
    }
}

abstract class B{
    abstract void show1();
    
}

class C extends B implements A{
    
    void show1(){
        System.out.println("Hello");
    }
}
public class Interface {
public static void main(String[] args) {
    C k =new C();
    k.show();
    k.show1();
}
    
}
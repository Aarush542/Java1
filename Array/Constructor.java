class A{
    class B{
        private B(){
            System.out.println("Hello");
        }
        static void show(){
            new A().new B();
            
            }
    }
 void show1(){
B.show();
}
}



public class Constructor {
public static void main(String[] args) {
    A k=new A();
}    
}

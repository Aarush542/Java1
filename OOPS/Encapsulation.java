class A{
     void show(){
        System.out.println("Hello Default");
    }
    protected void show1(){
        System.out.println("Hello Protected");
        show2();
    }
    private void show2(){
        System.out.println("Hello Private");
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
        A k =new A();
        k.show();
        k.show1();

    }
}

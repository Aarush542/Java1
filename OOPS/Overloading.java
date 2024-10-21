class A{
    void show(){
        System.out.println("Hello");
    }

    void show(int a){
        System.out.println("Hello1" + a);
    }
}
public class Overloading {
    public static void main(String[] args) {
        A k=new A();
        k.show();
    }
}

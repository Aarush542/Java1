class A{
    void show(int a){
        System.out.println(a);
    }
    void show(byte a){
        System.out.println(a);
    }
}
public class MethodOverloading {
public static void main(String[] args) {
    A k=new A();
    k.show(20);
    k.show((byte)20);
}}

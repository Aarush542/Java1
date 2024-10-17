class A{
    void show (int a){
System.out.println(a);
    }
    
}
public class Typecast {
    public static void main(String[] args) {
        A k=new A();
        k.show((byte)20);
    }
}

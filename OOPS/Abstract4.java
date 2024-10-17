abstract class A{
    abstract void show();

}
public class Abstract4 {
 public static void main(String[] args) {
    A k=new A() {
        void show(){
            System.out.println("Hello");
        }
    };
    k.show();
 }   
}

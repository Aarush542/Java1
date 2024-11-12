//sleep Method
class A extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(20);

            } catch (Exception e) {
System.out.println("Exception");           
 }
 System.out.println("Hello");

        }
    }
}
public class B {
    public static void main(String[] args) {
        A k=new A();
        k.start();
    }
}

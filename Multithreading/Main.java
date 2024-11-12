class A extends Thread{
    public void run(){
        while(true){
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Hello");
        }
    }
}

class B extends Thread{
    public void run(){
        while(true){
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("GoodBye");
        }
    }
}
public class Main{
    public static void main(String[] args) {
        A k=new A();
        B k1=new B();
        k.setPriority(8);
        k1.setPriority(4);
        System.out.println(k.getPriority());
        System.out.println(k1.getPriority());
        k.start();
        k1.start();

    }
}

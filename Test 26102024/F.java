class A extends Thread implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println();
    }
}


class B extends Thread implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A k=new A();
        B k1=new B();
        k.run();
        k1.run();
        
    }
}

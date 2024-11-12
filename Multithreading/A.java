// Basic Print Good mornig and welcome

class A extends Thread{
public void run(){
    while(true){
System.out.println("GoodMorning");
    }
}
}

class B extends Thread{
    public void run(){
        while(true){
    System.out.println("Welcome");
        }
    }
    }

class Main{
    public static void main(String[] args) {
        A k=new A();
        B k1=new B();
        k.start();
        k1.start();
    }
}
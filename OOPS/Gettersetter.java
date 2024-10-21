import java.util.Scanner;

class A{
    int a;
    int b;
    void set(int a,int b){
        this.a=a;
        this.b=b;
    }

    int get(){
        return a+b;
    }
}
public class Gettersetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        A k=new A();
        k.set(a,b);
    System.out.println(k.get());
    }
}

class A{
    A(int a){
        System.out.println("Hello"+ a);
    }

    A(float a){
        this(20);
        System.out.println(a);
    }
    
    A(int a,byte b){
        this(20.25f);
        System.out.println(a+" "+ b);
    }

    A(){
        this(12, (byte)13);
        System.out.println("Hello");
    }


}
public class ConstructorChaining {
    public static void main(String[] args) {
        new A();
    }
}

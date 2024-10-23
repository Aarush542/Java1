// // 2. Write a Java program to create a method that takes an integer as 
// a parameter and throws an exception if the number is odd.

class A {
    void show(int a) {

        if(a%2==0){
            System.out.println("Even");
        
        }
        else{
            throw new ArithmeticException();
        }
        
    }
}
class Main{
    public static void main(String[] args) {
        A k=new A();
        try{
            k.show(5);
        }
        catch(Exception ex){
            System.out.println("Handle");
        }
    }
}
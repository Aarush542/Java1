// 1. Write a Java program that throws an exception and catch it using a try-catch block.

class Main{
    public static void main(String[]args){
        try{
            int a=10/0;
            System.out.println(a);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
public class A extends Exception{

    public A(int a,int b){
        System.out.println(a/b);        
    }

    public static void main(String[] args) {

        int a=10;
        int b=0;

        try{
            throw new A(a, b);
        }
        catch(A ex){
            System.out.println(ex.getMessage());
        }
    }
}
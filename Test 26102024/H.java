import java.util.Scanner;

public class Main extends Exception{

    public Main(int Number){
        System.out.println(Number);        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Phone Number");
        int b=sc.nextInt();

        try{
            throw new Main(b);
        }
        catch(Main ex){
            System.out.println(ex.getMessage());
        }
    }
}
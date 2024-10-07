import java.util.Scanner;

public class Pallindromenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter Array");
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        //pallindrome number
        for(int i=0;i<a.length;i++){
            
        }
    }
}

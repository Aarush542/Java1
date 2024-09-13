import java.util.*;
public class pallindromearray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();  
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter array");
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}

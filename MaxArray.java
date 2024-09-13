import java.util.*;
public class MaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int size=sc.nextInt();
        
        int a[]=new int[size];
        int count=0;
        for(int i=0;i<a.length;i++){
            System.out.println("enter array");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            count ++;
        }
System.out.println(count);
    }
    
}

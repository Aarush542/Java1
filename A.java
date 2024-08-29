// arraylist :
// 1,2,3,4,5,6,7,8,9,10

// for loop data print 
// even number 
// odd number 
// count 
// sum even
// sum odd
// Armstrong number :151,152,153,154 
// palindrome number : 12321,456, 5678,16761
// factorial :1,2,3,4,5 
// neon number check : 9,5,2,1 
// prime number 

import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size =sc.nextInt();

        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.println("Enter Values");
            int a=sc.nextInt();
            al.add(a);
            
        }

        //print
        for(int i=0;i<size;i++){
            System.out.println(al.get(i));
        }

        //even number
        for(int i=0;i<size;i++){
           if(al.get(i)%2==0){
            System.out.print(al.get(i)+" ");
           }
        }

        // odd number 
        for(int i=0;i<size;i++){
            if(al.get(i)%2!=0){
                System.out.println(al.get(i)+" ");
            }
        }

        // sum even
        for(int i=0;i<size;i++){
            int sum=0;
            sum =sum+al.get(i);
            System.out.println(sum);
        }



    }
}

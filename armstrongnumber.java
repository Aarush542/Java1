import java.util.*;
public class armstrongnumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();  
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter array");
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            int rem,sum=0;
            int temp=a[i];
            while(temp>0){
                rem=temp%10;
                sum=sum+rem*rem*rem;
                temp=temp/10;
           
            }
            if(a[i]==sum){
                System.out.println(a[i]+ "Armstrong Number");
            }
           
            
        }
    }    
}

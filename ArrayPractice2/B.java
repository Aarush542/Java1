// 2. Write a Java program to sum values of an array.


public class B {
public static void main(String[] args) {
    int a[]={1,2,3,4,5,6,7,8,9};
    int sum=0;
    for(int i=0;i<a.length;i++){
        sum+=a[i];
    }
    System.out.println(sum);
}    
}

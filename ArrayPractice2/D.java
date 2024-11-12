// 4. Write a Java program to calculate the average value of array elements.


public class D {
    public static void main(String[] args) {
        float a[]={80,50,60,60,50};
        float sum=0;
        for(int i=0;i<a.length;i++){
    sum+=a[i];
    
        }
            System.out.println(sum);
    
        float avg=sum/a.length;
        System.out.println(avg);
    }    
    }
    
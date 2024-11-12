// 6. Write a Java program to find the index of an array element.

/**
 * F
 */
public class F{

    public static void main(String[] args) {
        int a[]={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int target=25;
            for(int i=0;i<a.length;i++){
                if(target==a[i]){
                System.out.println(i);
                }
            }
        }
    }

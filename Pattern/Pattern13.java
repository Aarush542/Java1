// 16. Write a Program to Print the Pant's style Star Pattern.

// *********
// **** ****
// ***   ***
// **     **
// *       *
package Pattern;
public class Pattern13 {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int s=6;s>i;s--){
                System.out.print("*");
            }
            for (int j=2;j<=i*2-1;j++){
                System.out.print(" ");
            } 
                        for(int s1=6;s1>i;s1--){
                System.out.print("*");
            }

        System.out.println();
        }
    }
}
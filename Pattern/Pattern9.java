// 12. Write a Program to Print the Inverted Full Pyramid Star Pattern.

// *********
//  *******
//   *****
//    ***
//     *
package Pattern;

public class Pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int s=0;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=9;j>=i*2-1;j--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

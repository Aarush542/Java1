// 4. Write a Program to print the Inverted Half Pyramid Star Pattern.

// *****
//  ****
//   ***
//    **
//     *
package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

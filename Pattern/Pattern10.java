// 13. Write a  Program to print the Solid Inverted Half Diamond Star Pattern.

//      *
//     **
//    ***
//   ****
//  *****
// ******
//  *****
//   ****
//    ***
//     **
//      *
package Pattern;

public class Pattern10 {
    public static void main(String[]args) {
    for(int i=1;i<=6;i++){
        for(int s=6;s>i;s--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
    System.out.println();
    }
     
    for(int i=1;i<=5;i++){
        for(int s=0;s<=i;s++){
            System.out.print(" ");
        }
        for(int j=5;j>i;j--){
            System.out.print("*");
        }
    System.out.println();
    }
    }
}

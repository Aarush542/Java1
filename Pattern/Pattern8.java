// 11. Write a Program to print the Full Pyramid Star Pattern.
 
//     *
//    ***
//   *****
//  *******
// *********
package Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int s=5;s>i-1;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
        System.out.println();
        
        }
    }
}

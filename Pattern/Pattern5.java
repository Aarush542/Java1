// 6. Write a Program to print an inverted pyramid star pattern.

// * * * * * 
//  * * * *
//   * * *
//    * *
//     *
package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}

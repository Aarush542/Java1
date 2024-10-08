// 10. Write a program to Print Inverted V Star Pattern.

//     *     
//    * *    
//   *   *   
//  *     *  
// *       *
package Pattern;

/**
 * Pattern7
 */
public class Pattern7 {

    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
        for(int j=0;j<=i*2-1;j++){
            if( j==1|| j==i*2-1){
            System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
    System.out.println();
    }
    }
}
// Enter the width of the HourGlass: 7
// * * * * * * *
//  * * * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
// * * * * * * *

package Pattern;
public class Pattern17 {

    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=8;j>i;j--){
                System.out.print("* ");
            }
                        System.out.println();

            
        }

        for(int i=2;i<=7;i++){
            for(int s=8;s>i;s--){
                System.out.print(" ");
            }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
    System.out.println();    
    }
    }
}
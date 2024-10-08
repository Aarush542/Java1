// 5. Write a Program to print the Full Pyramid Star pattern.

//     *  
//    * * 
//   * * *
//  * * * *
package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int s=4;s>i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
}


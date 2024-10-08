// 15. Write a Program to Print the Hollow Diamond Star Pattern.

//    *   
//   * *
//  *   * 
// *     *
//  *   *
//   * *
//    *
package Pattern;
public class Pattern12 {

    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int s=4;s>i;s--){
                System.out.print(" ");
            }
        for(int j=1;j<=i*2-1;j++){
            if(i==1||j==i*2-1||j==1){
            System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=7;j>=i*2-1;j--){
                if(j==1||j==i*2-1||j==7||i==4){
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
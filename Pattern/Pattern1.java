// 2. Write a Program to print an inverted right triangle star pattern.

// *****
// ****
// ***
// **
// *
package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }        
    }
}

// 1
// 333
// 55555
// 777777
// 99999999
package Pattern;

/**
 * Pattern20
 */
public class Pattern20 {

    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<5;i++){
            for(int j=i+1;j<=i;j++){
                System.out.print(a);
            }
        System.out.println();
        a+=2;
        }
    }
}
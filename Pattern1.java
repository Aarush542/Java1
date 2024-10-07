/**
 * Pattern1
 */
public class Pattern1 {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i == 1 || i == 5 || j == 3 || (i == 3 && j <= 3) || (i == 2 && j == 2)){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
System.out.println();
        }
    }
}
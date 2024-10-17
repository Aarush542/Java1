// 1
// 321
// 54321
// 7654321
// 987654321
package Pattern;
public class Pattern21 {

    public static void main(String[] args) {
        int p=1;
        for(int i =1;i<=5;i++){
            for(int j=p;j>1;j--){
                System.out.print(j);
            }
        System.out.println();
        p+=2;
        }
    }
}
// 22. Half Pyramid of Alphabets in C
// Last Alphabet: F

// Preview
// A
// B B
// C C C
// D D D D
// E E E E E
// F F F F F F
package Pattern;
public class Pattern16 {

    public static void main(String[] args) {
        char a='A';
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){

                System.out.print(a);
            

            }
                        a++;

            System.out.println();
        }
    }
}
// 3. Write a Java program to print the following grid.

// Expected Output :

// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -                                                                                           
// - - - - - - - - - -  
public class C{
    public static void main(String[] args) {
        int a[][]=new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(a[i][j]);
            }
        
            System.out.println();
        }
    }
}

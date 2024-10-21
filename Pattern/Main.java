// ABCDEF
// ABCDE
// ABCD
// ABC
// AB
// A
// A
// AB
// ABC
// ABCD
// ABCDE
// ABCDEF
public class Main {
    public static void main(String[] args) {
     char ch='A';
     for(int i=1;i<=6;i++){
         ch='A';
         for(int j=6;j>=i;j--){
 System.out.print(ch);
         
             ch++;
         }
     System.out.println();
     }
    
    for(int i=1;i<=6;i++){
        ch='A';
        for(int j=1;j<=i;j++){
            System.out.print(ch);
        ch++;
        }
    System.out.println();
    }
    } 
 }
 
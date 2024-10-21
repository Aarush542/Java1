public class Main {
    public static void main(String[] args) {
     char ch='A';
     for(int i=1;i<=6;i++){
         for(int s=5;s>=i;s--){
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
            if(i==1||i==j||j==6){
             System.out.print(ch+" ");
            }
         }
                     ch++;
 
     System.out.println();    
     }
    }
     }
 
 
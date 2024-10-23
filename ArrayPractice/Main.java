/**
 * Array4
 */
public class Main {

    public static void main(String[] args) {
        int a[]={10,20,50,40,60};
        int min=a[0];int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
                System.out.println(min);
                if(a[i]>max){
                    max=a[i];
                    System.out.println(max);
                }
            }
            
        }
    }
}
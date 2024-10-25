/**
 * Sort
 */
public class Sort {

    static class A{
        static void print(int a[]){
            for(int i:a){
                System.out.println(i);
            }
        }

        static void show(int a[]){
            int count=0;

        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count++;
            }
        }
    
        for(int i=0;i<a.length;i++){
            if(i<count){
                a[i]=0;
            }
            else{
                a[i]=1;
            }
        }
    }

        
    }
    public static void main(String[] args) {
        int a[]={1,0,0,1,0,1,0,0};
        A.print(a);
        A.show(a);
        A.print(a);

    }
}
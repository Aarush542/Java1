/**
 * Duplicate
 */
public class Duplicate {

    public static void main(String[] args) {
        int a[]={1,1,2,3,2,1,2,3,1,2,1,2,3};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=-1;
                }
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                System.out.println(a[i]);
            }
        }
    }
}
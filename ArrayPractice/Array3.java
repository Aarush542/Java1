/**
 * Array3
 */
public class Array3 {

    static void show(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
                System.out.println(min);
            }
        }
    }
    public static void main(String[] args) {
        int a[]={22,33,44,55,11};
        show(a);
    }
}
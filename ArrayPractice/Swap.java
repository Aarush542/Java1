//Swap last and 1st
public class Swap {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        //swap
        a[0]=a[0] + a[a.length-1];
        a[a.length-1]=a[0]-a[a.length-1];
        a[0]=a[0]-a[a.length-1];
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

        a[1]=a[1]+a[a.length-2];
        a[a.length-2]=a[1]-a[a.length-2];
        a[1]=a[1]-a[a.length-2];

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

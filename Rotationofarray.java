/**
 * Rotationofarray
 */
public class Rotationofarray {

    public static void main(String[] args) {
        int n=3;
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

for(int i=0;i<n;i++){
    int last=a[a.length-1];

    for(int j=a.length-1;j>0;j--){
        a[j]=a[j-1];
    }
    a[0]=last;
}
System.out.println("Array after rotation");
for(int i=0;i<a.length;i++){
    System.out.print(a[i]);
}
    }
}
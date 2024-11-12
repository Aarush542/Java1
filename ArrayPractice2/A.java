// 1. Write a Java program to sort a numeric array and a string array.


class Main{
    public static void main(String[] args) {
        int a[]={5,4,2,1,3,6,8,7};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        System.out.print(a[i]);
        }

    }
}
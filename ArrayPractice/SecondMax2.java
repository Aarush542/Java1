public class SecondMax2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,8,1,2,9,10,20,10};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
    System.out.println(max);
    int max2=a[0];
    for(int i=0;i<a.length;i++){
        if(max==a[i]){
            continue;
        }
        else if(a[i]>max2){
            max2=a[i];
        }
    }
    System.out.println(max2);

    int max3=a[0];
    for(int i=0;i<a.length;i++){
        if(max2==a[i]){
            continue;
        }
        else if(max==a[i]){
            continue;
        }
        else if(a[i]>max3){
            max3=a[i];
        }
    }
    System.out.println(max3);
}
}

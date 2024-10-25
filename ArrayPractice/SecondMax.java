class SecondMax{
    public static void main(String[] args) {
        int a[]={1,1,1,2,2,2,8,8,8,4,4,7,8,3,5};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        
        }
System.out.println(max);
int max1=a[0];
for(int i=0;i<a.length;i++){
    if(max==a[i]){
        continue;
    }
    else if(max1<a[i]){
        max1=a[i];
        
    }
}
    System.out.println(max1);
        
    }
}
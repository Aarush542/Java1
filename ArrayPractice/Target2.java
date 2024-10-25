public class Target2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int target=9;
        for(int i=1;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(target==a[i]+a[j]+a[0]){
                    System.out.println(a[i]+" "+ a[j]);

                }
            }
        }
    }
}

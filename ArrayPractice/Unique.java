public class Unique {
    public static void main(String[] args) {
        int a[]={1,1,2,3,2,4,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=-1;
                    a[i]=-1;
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

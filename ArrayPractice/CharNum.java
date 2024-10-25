public class CharNum {
    public static void main(String[] args) {
        char a[]={'A','B','C'};
        int b[]={1,2,3};
        for(int i=0;i<b.length-1;i++){
            for(char j=0;j<a.length-1;j++){
                System.out.print(b[i]+""+a[j]);
            }
        }
    }
}

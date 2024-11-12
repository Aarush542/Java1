public class Countvowel {
    public static void main(String[] args) {
        int count=0;
        String s="Java is a programming language";
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ){
                count++;
            }
 }
 System.out.println(count);
    }
}

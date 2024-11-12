public class Vowelcheck {
    public static void main(String[] args) {
        String s="Java is a programming language";
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ){
                System.out.println("Vowel "+a[i]);
            }

            else{
                System.out.println("Consonant "+ a[i]);
            }
        }
    }
}

// java is programming language :
// 	a :present 
// 	count 
// 	first index 
// 	last index 
public class First {
    public static void main(String[] args) {
        int count=0;
        String s="Java is programming language";
        char a[]=s.toCharArray();
        System.out.println(s.indexOf(s));
        System.out.println(s.lastIndexOf(s));
        for(int i=0;i<a.length;i++){
            if(a[i]=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}

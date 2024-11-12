public class Count {
    public static void main(String[] args) {
        String s="Java is a programming language";
        int count=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            count++;
        }
        System.out.println(count);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(20);
System.out.println(a);

        List<Integer> b=new ArrayList<>();
        b.add(12);
        b.add(15);
        b.add(20);
        b.add(32);
        System.out.println(b);

        List<Integer> c=new ArrayList<>();
        c.addAll(a);
        c.addAll(b);

        System.out.println(c);

        for(int i=0;i<c.size();i++){
            for(int j=i+1;j<c.size();j++){
                if(c.get(i)==c.get(j)){
                    c.set(j, -1);
                }
            }
        }

        for(int i=0;i<c.size();i++){
            if(c.get(i)>0){
                System.out.println(c.get(i));
            }
        }
        

    }
}

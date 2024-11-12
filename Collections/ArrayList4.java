import java.util.*;

/**
 * ArrayList4
 */
public class ArrayList4 {

    public static void main(String[] args) {
        List<Integer> a=new ArrayList<Integer>();
        a.add(20);
        a.add(30);
        a.add(13);
        a.add(15);
        a.add(24);
        System.out.println(a);

        int b=a.get(0);
        for(int i:a){
        if(b%2==0){
            System.out.println(a.get(i)+" Even Print");
        }
    }
    }
}
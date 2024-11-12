import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(20);
        a.add(40);
        a.add(60);
        a.add(80);
        a.add(40); 

        LinkedHashSet<Integer> set = new LinkedHashSet<>(a);
        a.clear();
        a.addAll(set); 
        
        for (int i : a) {
            System.out.println(i);
        }
    }
}

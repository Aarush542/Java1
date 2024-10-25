import java.util.ArrayList;
import java.util.List;

public class Print {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(20);
System.out.println(a.get(1));
a.set(2, 50);
System.out.println(a);


    }
}

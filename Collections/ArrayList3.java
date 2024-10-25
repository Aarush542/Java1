import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<Integer>();
        i.add(20);
        i.add(30);
        i.add(0,50);
        for(int j: i){
            System.out.println(j);
        } 
    }
}

import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Hyundai");
        cars.add("Kia");
        cars.add("Mahindra");
        cars.add(0,"Lexus");
        for(String i:cars){
            System.out.println(i);
        }
    }
}

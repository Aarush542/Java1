/**
 * ArrayList
 */
// adding in array list
import java.util.ArrayList;
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Maruti");
        cars.add("Hyundai");
        cars.add("Kia");
        for(String i:cars){
            System.out.println(i);
        }

    }
}
import java.util.*;
public class Arraylistsum {
    public static void main(String[] args) {
     ArrayList<Integer> hs=new ArrayList<>();
     hs.add(10);
     hs.add(20);
     hs.add(30);
     int sum=0;
    
     for(int i=0;i<hs.size();i++){
        sum=sum+hs.get(i);
     }
     System.out.println(sum);
    }
}

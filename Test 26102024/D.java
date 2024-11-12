import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a.add(20);
        a.add(40);
        a.add(60);
        a.add(20);
        a.add(40);
        for(int i:a){
            System.out.println(i);
        }

        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i)==a.get(j)){
                    a.set(j, -1);
                }
            }
        }

        for(int i=0;i<a.size();i++){
            if(a.get(i)>0){
                System.out.print(a.get(i)+" ");
            }
        }
    
    }
}

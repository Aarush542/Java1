// 3)
// user input :
// Book 
// name
// publisher
// author
// price
// contact 
// address

// LinkedHashSet
import java.util.*;
class A{
    int Book;
    String Name;
    String Publisher;
    String Author;
    int price;
    double contact;
    String Address;
    A(int Book,String Name,String Publisher,String Author,int price,double contact,String Address){
        this.Book=Book;
        this.Name=Name;
        this.Publisher=Publisher;
        this.Author=Author;
        this.price=price;
        this.contact=contact;
        this.Address=Address;
    }
}
public class Linkedhashset {

    public static void main(String[] args) {
        A p=new A(10, "Aarush", "Mukesh", "Ankit", 999, 9680816222d, "Jaipur");
   LinkedHashSet<A> hs1=new LinkedHashSet<>();
   hs1.add(p);
   for(A k:hs1){
    System.out.println(k.Book+ k.Name+ k.Publisher+ k.Author+ k.price+ k.contact+ k.Address);
   }
    }
}
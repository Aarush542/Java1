import java.util.Scanner;

class ATM{
    private long accountnumber;
    private int Pin;
    private int Balance;

    void set(long accountnumber, int Pin, int Balance){
        this.accountnumber=accountnumber;
        this.Pin=Pin;
        this.Balance=Balance;
    }

    long get(){
        return accountnumber;
    }

    int get1(){
        return Pin;
    }

    int get2(){
        return Balance;
    }
}
public class EncapsulationGetSet {
    public static void main(String[] args) {
        ATM k=new ATM();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Pin");
        int Pin=sc.nextInt();
        if(Pin==2422){

        int Balance=5000;
        long accountnumber=279310100;
        k.set(accountnumber, Pin, Balance);
        System.out.println("Account Number "+ k.get());        
        System.out.println("Balance "+ k.get2());
        }
        else{
            System.out.println("Wrong Pin");
        }
    }
}

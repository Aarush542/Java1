import java.util.Scanner;

class BankAccount{
    private int AccountNumber;
    private float Balance;
    
    void set(int AccountNumber,float Balance){
        if(AccountNumber>0000 && AccountNumber<9999 && Balance>0){
        this.AccountNumber=AccountNumber;
        this.Balance=Balance;
        }
    }

    int get(){
        return AccountNumber;
    }

    float get1(){
        return Balance;
    }

    void deposit(){
        if(AccountNumber>=0000 && AccountNumber<=9999 && Balance>0){
            get();
            get1();
        }
        System.out.println("Amount Deposit");
    }

    void withdraw(){
        if(AccountNumber>=0000 && AccountNumber<=9999 && Balance>0){
            get();
            get1();
        }
        System.out.println("Amount Withdraw");
    }
    
}
public class Main {
    public static void main(String[] args) {
        BankAccount k=new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number of 4 Digit");
        int AccountNumber=sc.nextInt();
        System.out.println("Enter Balance Greater than 0");
        float Balance=sc.nextFloat();
        k.set(AccountNumber, Balance);
        System.out.println(k.get());
        System.out.println(k.get1());
        k.deposit();
        k.withdraw();

    }
}

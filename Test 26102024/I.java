import java.util.Scanner;

public class Main extends Exception {
    
    void setMarks(int b) throws Main {  
        if (b > 0 && b < 100) {
            System.out.println("Marks Under 0-100");
        } else {
            throw new Main(); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int b = sc.nextInt();

        Main exception = new Main(); 
        try {
            exception.setMarks(b);  
        } catch (Exception ex) {
            System.out.println("Invalid marks. Marks should be between 1 and 99.");
        }
    }
}

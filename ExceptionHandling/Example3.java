// // 6. Write a Java program that reads a list of integers from the user 
// and throws an exception if any numbers are duplicates.

class A{
    void show(){
    int a[]={1,2,3,4,5};
    for(int i=0;i<=a.length;i++){
        for(int j=i+1;j<=a.length;j++){
            if(a[i]==a[j]){
            throw new ArithmeticException();           
            }
           
        }
    }
}
}
class Main{
    public static void main(String[] args) {
        A k = new A();
        try {
            k.show();
            throw new Exception("array is duplicate");
           
        } catch (Exception e) {
            System.out.println("Handle");
        }
    }
}

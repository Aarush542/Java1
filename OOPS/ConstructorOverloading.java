class A{
    A(){
        System.out.println("Hello");
    }
    A(char a){
        this();
        System.out.println("Hello" + " "+ a);
        
        
    }

    A(int a){
        this('a');
        System.out.println("Yellow");
        
    }
    A(float b){
        this(10);
        System.out.println("Red"+ b);
    
    }

}

class Main{
    public static void main(String[] args) {
       A k = new A();
    }
}
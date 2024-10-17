class A{
  B p;
  int b;
  A(B p, int b){
   this.p=p;
   this.b=b;
  }
  void show(){
    System.out.println(p.a);
    System.out.println(b);
  }
}
public class File1 {
public static void main(String[] args) {
   B p=new B(56);
   A l=new A(p, 45);
   l.show();

}
}

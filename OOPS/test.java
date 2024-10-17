class A{
void show(){
    int a[]={1,2,3,4,5};
for(int i=1;i<a.length;i++){
    System.out.println(a[i]);
}
}
}
class Test{
    public static void main(String[] args) {
        A k =new A();
        k.show();
    }
}
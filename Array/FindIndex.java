
public class FindIndex {
public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    int target=4;
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    //finding target
    for(int i=0;i<a.length;i++){
        if(target==4){
            System.out.println(i);
        }
    else{
        System.out.println("Not found");
    }
    }
}
    
}
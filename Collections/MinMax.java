// // // Java Program to Get Minimum and Maximum From a List

// // import java.util.*;


// // public class MinMax {
// // public static void main(String[] args) {
// //     ArrayList<Integer> a=new ArrayList<>();
// //     a.add(12);
// //     a.add(24);
// //     a.add(32);
// //     a.add(22);

// //     int min=0;
// //     for(int i:a){
// //         if(min>i){
// //             min=i;
// //         }
// //     }
// //     System.out.println(min);
// // }    
// // }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> a = new ArrayList<>();
       
//         a.add(24);
//         a.add(32);
//         a.add(22);
//          a.add(12);

//         // Initialize min to the first element of the list
//         int max = a.get(0);
        
//         // Loop through the list to find the minimum value
//         for (int i : a) {
//             if (i > max) {
//                 max = i;
//             }
//         }
        
//         System.out.println("Minimum value: " + max);
//     }    
// }

// // // // // /** MIN
// // // // //  * Practice
// // // // //  */
// // // // // public class Practice {
// // // // //     public static void main(String[] args) {
// // // // //         int a[]={1,2,3,4,5};
// // // // //         int min=a[0];
// // // // //         for(int i=0;i<a.length;i++){
// // // // //             if(a[i]<min){
// // // // //                 min=a[i];
// // // // //             }
// // // // //         }
// // // // //         System.out.println(min);
// // // // //     }
// // // // // }

// // // // /**  MAX
// // // //  * Practice
// // // //  */
// // // // public class Practice {

// // // //     public static void main(String[] args) {
// // // //         int a[]={1,2,3,4,5};
// // // //         int max=a[0];
// // // //         for(int i=0;i<a.length;i++){
// // // //             if(a[i]>max){
// // // //                 max=a[i];
// // // //             }
// // // //         }
// // // // System.out.println(max);
// // // //     }
// // // // }

// // // // Duplicate Array remove
// // // /**
// // //  * Practice
// // //  */
// // // public class Practice {

// // //     public static void main(String[] args) {
// // //         int a[]={1,1,2,3,4,5,3,2,1,2,3,4,5,4};
// // //         for(int i=0;i<a.length;i++){
// // //             for(int j=i+1;j<a.length;j++){
// // //                 if(a[i]==a[j]){
// // //                     a[j]=-1;
// // //                 }
// // //             }
// // //         }

// // //         for(int i=0;i<a.length;i++){
// // //             if(a[i]>0){
// // //                 System.out.println(a[i]);
// // //             }
// // //         }
// // //     }
// // // }

// // // sort 1,0,0,1,0,1,0,0
// // /**
// //  * Practice
// //  */
// // public class Practice {

// //     public static void main(String[] args) {
// //         int a[]={1,0,0,1,0,1,0,0};
// //         for(int i=0;i<a.length;i++){
// //             System.out.println(a[i]);
// //         }

// //         int count=0;
// //         for(int i=0;i<a.length;i++){
// //             if(a[i]==0){
// //                 count++;
// //             }
// //         }

// //         for(int i=0;i<a.length;i++){
// //             if(i<count){
// //                 a[i]=0;
// //             }
// //             else{
// //                 a[i]=1;
// //             }
// //         System.out.println(a[i]);
// //         }
    
// //     }
// // }

// // Array Sort
// /**
//  * Practice
//  */
// public class Practice {

//     public static void main(String[] args) {
//         int a[]={5,3,2,4,1};
//         for(int i=0;i<a.length;i++){
//             for(int j=i+1;j<a.length;j++){
//                 if(a[i]>a[j]){
//                     a[i]=a[i]+a[j];
//                     a[j]=a[i]-a[j];
//                     a[i]=a[i]-a[j];
//                 }
//             }
//         System.out.println(a[i]);
//         }

//     }
// }

//Swap last and first
/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
                if(a[i]>0){
                    a[i]=a[i]+a[a.length-1];
                    a[a.length-1]=a[i]-a[a.length-1];
                    a[i]=a[i]-a[a.length-1];
                }
            System.out.println(a[i]);
            }
        }
    }

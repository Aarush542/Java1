public class Matrixsum {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{5,6,7}};
        int b[][]={{11,13,14},{16,17,18}};
        int result[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result[i][j]=a[i][j]+b[i][j];
                System.out.print(result);

            }
        }
        System.out.println();
    }

}

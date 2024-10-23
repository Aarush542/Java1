public class AvgMarks {
    public static void main(String[] args) {
        float physics[]={45.7f,67.8f,63.4f,99.2f,100.0f};
        float avg;
        float sum=0;
        for(float i:physics){
            sum+=i;
        }
        System.out.println(sum);
        avg=(sum/500)*100;
        System.out.println(avg);
    }
}

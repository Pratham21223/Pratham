package Chapter_6_Arrays;

public class P3_array_avg {
    public static void main(String[] args) {
        int [] n={78,89,56,81,90,87,76};
        int sum=0;
        for(int element:n)
        {
            sum=sum+element;
        }
        double avg=sum/n.length;
        System.out.println(avg);
    }
}

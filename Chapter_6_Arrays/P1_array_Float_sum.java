package Chapter_6_Arrays;

public class P1_array_Float_sum {
    public static void main(String[] args) {
        float [] s={0.5f,1.5f,2.5f,3.5f,4.5f};
        float sum=0f;
        for(int i=0;i<s.length;i++)
        {
            sum=sum + s[i];
        }
        System.out.println(sum);
    }
}

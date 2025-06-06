package Chapter_7_Methods;

public class P6_avg_varargs {
    static double avg(int x,int ...arr){
        double avg=x;
        for(int a:arr)
            {
                avg+=a;
            }
        avg=x+avg/(arr.length+1);
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(avg(1,2,3));
    }
}

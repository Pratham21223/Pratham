package Chapter_7_Methods;

public class var_args {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }
    //Var args the ninja technique
    private static int sum(int x,int...arr){
        int sum=x;
        for(int a:arr){
            sum=sum+a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to var args");
        System.out.println("The sum of nothing is "+sum(1));
        System.out.println("The sum of 4 & 5 is "+sum(4,5));
        System.out.println("The sum of 4,3 & 5 is "+sum(4,5,3));
        System.out.println("The sum of 4,3,2 & 5 is "+sum(4,5,3,2));
        System.out.println("The sum of 4,3,2,1 & 5 is "+sum(4,5,3,2,1));

    }
}

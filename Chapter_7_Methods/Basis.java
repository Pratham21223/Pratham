package Chapter_7_Methods;

public class Basis {
    static int logic(int x,int y){
        int z;
        if(x>y)
        {
            z=(x+y)*12;
        }
        else
        {
            z=x+y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=4;
        int c;
//        Basis obj=new Basis();
//        c=obj.logic(a,b);
        c=logic(a,b);
        int a1=5;
        int b1=7;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);
        System.out.println(c);
}
}

package Chapter_7_Methods;

public class Method_Overloading {
    static void change(int a){
        a=54;
    }
    static void change2(int [] b)
    {
        b[0]=98;
    }
    static void foo(){
        System.out.println("Good morning bro");
    }
    static void foo(int a){
        System.out.println("Good morning bro"+a);
    }
    static void foo(int a1,int b1){
        System.out.println(a1+b1);
    }
    static void Name(){
        System.out.println("My name is:\n Pratham");
    }
    public static void main(String[] args) {
        Name();
        //Changing the integer
        int x = 54;
        change(x);
        System.out.println(x);
        //Changing an array (obj)
        int []marks={77,52,46,89,67};
        change2(marks);
        System.out.println(marks[0]);

        //Method overloading
        foo();
        foo(5000);
        foo(6,7);
        //arguments are actual


    }
}

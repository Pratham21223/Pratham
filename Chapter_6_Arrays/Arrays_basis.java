package Chapter_6_Arrays;

public class Arrays_basis {
    public static void main(String[] args) {
//        There are three ways to create arrays in java
        //1. Declaration and memory allocation
        int [] marks=new int[5];
        marks[0]=98; //initialisation
        marks[1]=100;
        marks[2]=97;
//        marks[5]=96; //Throws an error
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //2. Declaration and then memory allocation
        int [] markss;
        markss=new int[5]; //initialisation
        markss[1]=98;
        //3. All together simultaneously
        int mark[] ={100,98,97,98,1};//Java khud hi pata kar lega kitne arrays hai!!
        System.out.println(mark[4]);
    }
}

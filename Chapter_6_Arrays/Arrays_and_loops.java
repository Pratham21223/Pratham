package Chapter_6_Arrays;

public class Arrays_and_loops {
    public static void main(String[] args) {
        /* int mark[] ={100,98,97,98,1};
        double mar[]={100.5,99.6,97.3};
        String students[]={"Pratham", "Khanak","Jayshree","Ramesh", "Sayarbai"};
        System.out.println(mark.length);
        System.out.println(mar.length);
        System.out.println(students.length); */
        //Displaying an array
        System.out.println("Using For loop");
        int marks[] ={100,98,97,98,76};
        for(int i=marks.length-1;i>=0;i--) {
            System.out.println(marks[i]); //Array Traversal
        }
        //Displaying an array in reverse order
        System.out.println("Displaying an array in reverse order");
        for(int i=marks.length-1;i>=0;i--) {

            System.out.println(marks[i]); //Array Traversal
        }
        //Method 2 for-each loop
        System.out.println("Using for-each loop");
        for(int element:marks)
        {
        System.out.println(element);
    }
        }
}

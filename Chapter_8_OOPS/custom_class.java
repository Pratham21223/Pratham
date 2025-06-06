package Chapter_8_OOPS;
class employee{
    int id;
    int salary;
    String name;
    int marks;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
        System.out.println("My marks is "+marks);
    }
    public int getSalary(){
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("Custom class");
        employee pratham=new employee(); //Instantiating a new employee object
        employee khanak=new employee(); //Instantiating a new employee object

        //Setting attributes for Pratham
        pratham.id=12;
        pratham.name="Pratham";
        pratham.marks=97;
        pratham.salary=56;
        //Setting attributes for Khanak
        khanak.id=15;
        khanak.name="Khanak";
        khanak.marks=98;
        //Printing a property normal way
//        System.out.println(pratham.name);
//        System.out.println(pratham.id);
        //Printing a property methods way
        pratham.printdetails();
        khanak.printdetails();
        int salary= pratham.getSalary();
        System.out.println(salary);
    }
}

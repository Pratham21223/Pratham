package Chapter_6_Arrays;

public class P2_Check_in_array {
    public static void main(String[] args) {
        float [] s={0.5f,1.5f,2.5f,3.5f,4.5f};
        float num = 1.7f;
        boolean isinarray = false;
        for(float element:s) {
            if (num == element) {
                isinarray = true;
                break;
            }
        }
        if(isinarray){
                System.out.println("Yes the number is an array");
            }
            else {
                System.out.println("No number is not in array");
            }
        }
    }

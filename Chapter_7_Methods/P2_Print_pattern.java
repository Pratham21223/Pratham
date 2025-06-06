package Chapter_7_Methods;

public class P2_Print_pattern {
    static void pattern(){
        String str="*";
for(int i = 4;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print(str);
    }
    System.out.println();
}
    }
    public static void main(String[] args) {
        pattern();
    }
}

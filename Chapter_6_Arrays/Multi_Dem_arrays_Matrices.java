package Chapter_6_Arrays;

public class Multi_Dem_arrays_Matrices {
    public static void main(String[] args) {
        int [] marks; //1D array
        int [][] flats=new int [3][3]; // 2D array
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;
        flats [2][0] = 301;
        flats [2][1] = 302;
        flats [2][2] = 303;

        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}

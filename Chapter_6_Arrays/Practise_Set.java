package Chapter_6_Arrays;

public class Practise_Set {
    public static void main(String[] args) {
        //Practise 1
        /* float []f={89.0f,66.8f,56.7f,45.8f,55.8f};
        float sum=0f;
        for(int i=0;i<f.length;i++)
        {
            sum=sum+f[i];
        }
        System.out.println(sum);*/
        //Practise 2
        /* float []f={89.0f,66.8f,56.7f,45.8f,55.8f};
        float num=66.2f;
        boolean is_an_array=false;
        for(int i=0;i<f.length;i++)
        {
            if(f[i]==num)
            {
                is_an_array=true;
                break;
            }

        }
        if(is_an_array==true)
        {
            System.out.println("Yes the number is in the array");
        }
        else if(is_an_array==false)
        {
            System.out.println("No, the number is not in array");
        }*/
        //Practise 3
        /* float []f={89.0f,66.8f,56.7f,45.8f,55.8f};
        float sum=0;
        for(int i=0;i<f.length;i++)
        {
            sum=sum+f[i];
        }
        System.out.println(sum); */
        //Practise 4
        /* int [][]m1={{1,2,3},{4,5,6}};
        int [][]m2={{7,8,9},{10,11,12}};
        int [][]sum={{0,0,0},{0,0,0}};
        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j<m1[i].length;j++)
            {
                sum[i][j]=m1[i][j]+m2[i][j];
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        } */
        //Practise 5
        /* int []i={1,2,3,4,5};
        for(int j=i.length-1;j>=0;j--)
        {
            System.out.println(i[j]);
        }*/
        //Practise 6
        /*int[]i={1,2,6,4,5};
        int max=Arrays.stream(i).max().getAsInt();
        int min= Arrays.stream(i).min().getAsInt();
        boolean sorted=false;
        System.out.println("Largest number among the given array "+max);
        System.out.println("Min value among the given array "+ Arrays.stream(i).min().getAsInt());*/
        //Aliter
        /*int[]i={1,2,6,4,5};
        int max=0;
        for(int e: i) {
            if (e >max) {
                max = e;
            }
        }
        System.out.println("Max value of n = "+max); */
        //Practise 7

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        boolean sorted = true;
        for (int i = 0; i<arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("The array is sorted");
        }
            else
            {
                System.out.println("The array is not sorted");
            }
        }
    }

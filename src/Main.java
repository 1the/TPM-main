import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int x=input.nextInt();
        System.out.print("\n Enter num of columns: ");
        int y=input.nextInt();
        int [][] arr1= new int[x][y];
        //in
        for(int j=0; j<x; j++)
        {
            for(int k=0;k<y;k++)
            {
                int in=input.nextInt();
                arr1[j][k]=in;
            }
        }
        //transpose
        int [][] arr2= new int[y][x];
        for(int j=0; j<y; j++)
        {
            for(int k=0;k<x;k++)
                arr2[j][k]=arr1[k][j];
        }
        //out
        System.out.println("Transposed 2D array: ");
        for(int j=0; j<y; j++)
        {
            for(int k=0;k<x;k++)
            {System.out.print(arr2[j][k]+" ");}
            System.out.println();
        }
    }

}
import java.util.*;
public class MatAdd
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = s.nextInt();

        int[][] firstMatrix = new int[rows][cols];
        int[][] secondMatrix = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                firstMatrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                secondMatrix[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

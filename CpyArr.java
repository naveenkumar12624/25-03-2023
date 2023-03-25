public class CpyArr
{
    public static void main(String[] args)
    {
        int[] arr1 = {6, 5, 4, 3, 2, 1};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of the 1st Array : ");
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nElements of the 2nd Array : ");
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
package week2;

public class MaxDifferenceBruteforce
{
    int maxDiff(int arr[], int arrSize)
    {
        int maxDiff = arr[1] - arr[0];
        int i, j;
        for (i = 0; i < arrSize; i++)
        {
            for (j = i + 1; j < arrSize; j++)
            {
                if (arr[j] - arr[i] > maxDiff)
                    maxDiff = arr[j] - arr[i];
            }
        }
        return maxDiff;
    }
    public static void main(String[] args)
    {
        MaxDifferenceBruteforce maxDif = new MaxDifferenceBruteforce();
        int arr[] = {1, 2, 90, 10, 110};
        System.out.println("Maximum difference is " + maxDif.maxDiff(arr, 5));
    }
}
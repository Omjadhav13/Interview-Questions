using System;

class Program
{
    static void MaxSubarraySum(int[] a, int size)
    {
        int maxSum = a[0];
        int currentSum = a[0];

        for (int i = 1; i < size; i++)
        {
            currentSum = Math.Max(a[i], currentSum + a[i]);
            maxSum = Math.Max(maxSum, currentSum);
        }

        Console.WriteLine("Maximum Subarray Sum: " + maxSum);
    }

    static void Main()
    {
        Console.Write("Enter the size of array: ");
        int size = int.Parse(Console.ReadLine());
        int[] a = new int[size];

        Console.WriteLine("Enter the elements in array:");
        for (int i = 0; i < size; i++)
            a[i] = int.Parse(Console.ReadLine());

        MaxSubarraySum(a, size);
    }
}

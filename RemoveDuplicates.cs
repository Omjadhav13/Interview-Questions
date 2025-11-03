using System;

class Program
{
    static void RemoveDuplicates(int[] a, int size)
    {
        int count = 0;
        for (int i = 0; i < size - 1; i++)
        {
            if (a[i] == a[i + 1])
            {
                count++;
                continue;
            }
            else
            {
                Console.Write(a[i] + " ");
            }
        }
        Console.WriteLine("\nDuplicates removed: " + count);
    }

    static void Main()
    {
        Console.Write("Enter the size of array: ");
        int size = int.Parse(Console.ReadLine());
        int[] a = new int[size];

        Console.WriteLine("Enter the elements in array:");
        for (int i = 0; i < size; i++)
            a[i] = int.Parse(Console.ReadLine());

        RemoveDuplicates(a, size);
    }
}

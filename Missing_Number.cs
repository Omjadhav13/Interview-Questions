using System;

class Programs
{
    static void Main()
    {
        Console.Write("Enter the size of the array: ");
        int size = int.Parse(Console.ReadLine());
        int[] a = new int[size];
        Console.WriteLine("Enter the elements in the array:");
        for (int i = 0; i < size; i++)
        {
            a[i] = int.Parse(Console.ReadLine());
        }
        int miss = Missing(a, size);
        Console.WriteLine("Missing number: " + miss);
    }
    static int Missing(int[] a, int size)
    {
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j < size - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size - 1; i++)
        {
            if (a[i + 1] - a[i] != 1)
            {
                return a[i] + 1;
            }
        }
        return -1;
    }
}

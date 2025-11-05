public class MergeArray {

    static void merge(int[] num1, int size1, int[] num2, int size2) {
        int size = size1 + size2;
        int[] merged = new int[size];

        // Copy elements of num1
        for (int i = 0; i < size1; i++) {
            merged[i] = num1[i];
        }

        // Copy elements of num2
        for (int i = 0; i < size2; i++) {
            merged[size1 + i] = num2[i];
        }

        // Bubble sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }

        // Print merged sorted array
        System.out.print("Merged sorted array: ");
        for (int n : merged) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {2, 5, 6};

        merge(num1, num1.length, num2, num2.length);
    }
}

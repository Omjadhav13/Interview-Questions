import java.util.Scanner;
public class ProductExceptSelf {
    static void productExceptSelf(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            int product = 1;
            for(int j = 0; j < size; j++) {
                if(i == j) continue;
                product *= arr[j];
            }
            System.out.print("[" + product + "] ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in array:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        productExceptSelf(arr, size);
    }
}

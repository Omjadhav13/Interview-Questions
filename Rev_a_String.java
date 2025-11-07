import java.util.Scanner;

public class Rev_a_String {
	
    static void reverseString(char[] string) {
        int left = 0;
        int right = string.length - 1;
        while(left < right) {
            char temp=string[left];
            string[left]=string[right];
            string[right]=temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        char[] arrOfChar = input.toCharArray();
        reverseString(arrOfChar);
        System.out.println("Reversed string: " + new String(arrOfChar));
    }
}

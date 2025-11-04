import java.util.Scanner;

public class Valid_Parentheses {
    static boolean isValid(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == '(' && s.charAt(i + 1) != ')') ||
                (s.charAt(i) == '{' && s.charAt(i + 1) != '}') ||
                (s.charAt(i) == '[' && s.charAt(i + 1) != ']')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of parentheses: ");
        String input = sc.nextLine();

        System.out.println(isValid(input) ? "true" : "false");
    }
}

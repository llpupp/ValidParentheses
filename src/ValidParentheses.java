import java.util.Scanner;

public class ValidParentheses {

    private static boolean a = true;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean character = isValid(scan.nextLine());

        System.out.println(character);


    }

    public static boolean isValid(String b) {

        char firstCharacter = b.charAt(0);
        char lastCharacter = b.charAt(b.length() - 1);

        if (firstCharacter == '(' && lastCharacter == ')') {
            a = true;
        } else if (firstCharacter == '[' && lastCharacter == ']') {
            a = true;
        } else {
            a = false;
        }
        return a;

    }
}


import java.util.Scanner;

public class PasswordCheck {

    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        String password;

        password = scanner.nextLine();

        if(lengthCheck(password) && twolowercaseCheck(password) && twouppercaseCheck(password) && twodigitCheck(password)) {
            System.out.println("Valid Password!");
        } else {
            System.out.println("Invalid Password!");
        }

    }

    private static boolean lengthCheck(String input) {

        return input.length() >= 10;

    }
    private static boolean twolowercaseCheck(String input) {

        int number = 0;

        for(int i = 0 ; i < input.length() ; i ++) {

            if (Character.isLowerCase(input.charAt(i)))
                number ++;

        }

        return number >= 2;

    }
    private static boolean twouppercaseCheck(String input) {

        int number = 0;

        for(int i = 0 ; i < input.length() ; i ++) {

            if (Character.isUpperCase(input.charAt(i)))
                number ++;

        }

        return number >= 2;

    }
    private static boolean twodigitCheck(String input) {

        int number = 0;

        for(int i = 0 ; i < input.length() ; i ++) {

            if (Character.isDigit(input.charAt(i)))
                number ++;

        }

        return number >= 2;

    }
}

public class Factorial {

    public static void main(String []args) {

        try {

            int number = Integer.parseInt(args[0]);
            System.out.println(calculate(number));

        } catch (Exception e) {

            System.out.println("Error: no value supplied for n");

        }

    }
    private static int calculate(int input) {
        int result = 1;
        for(int i = 1 ; i <= input ; i ++) {
            result *= i;
        }
        return result;
    }

}

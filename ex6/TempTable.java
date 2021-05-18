public class TempTable {
    public static void main(String []args) {

        System.out.println("+----------+---------+");
        System.out.print("|    ");
        System.out.print("\u00b0F    |   ");
        System.out.println("\u00b0C    |");
        System.out.println("+----------+---------+");

        for(int i = 20 ; i <= 100 ; i += 5) {
            System.out.print("|");

            String fahren = String.format("%.1f", (float)i);
            String celsius = String.format("%.1f", (i - 32) * 5.0/9 );

            System.out.format("%1$" + (7 - fahren.length()) +"s", "");
            System.out.print(fahren);
            System.out.format("%1$3s", "");
            System.out.print("|");
            System.out.format("%1$" + (6 - celsius.length()) +"s", "");
            System.out.print(celsius);
            System.out.format("%1$3s", "");
            System.out.println("|");

        }

        System.out.println("+----------+---------+");

    }
}

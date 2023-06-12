import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String ticket = sc.next();

        System.out.println(checkTheTicket(ticket) ? "Lucky" : "Regular");
    }

    public static boolean checkTheTicket(String ticket) {
        char[] numAr = ticket.toCharArray();

        int firstPart = 0;
        for (int i = 0; i < numAr.length / 2; i++) {
            firstPart += Character.getNumericValue(numAr[i]);
        }

        int secondPart = 0;
        for (int i = numAr.length / 2; i < numAr.length; i++) {
            secondPart += Character.getNumericValue(numAr[i]);
        }

        return firstPart == secondPart;
    }
}
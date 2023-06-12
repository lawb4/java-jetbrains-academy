import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String xyz = sc.next();

        if (alphabet.contains(xyz)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
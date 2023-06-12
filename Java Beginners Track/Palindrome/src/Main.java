import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String check = sc.next();
        System.out.println(checkIfPalindrome(check) ? "yes" : "no");
    }

    public static boolean checkIfPalindrome(String check) {
        int j = check.length() - 1;
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) != check.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
